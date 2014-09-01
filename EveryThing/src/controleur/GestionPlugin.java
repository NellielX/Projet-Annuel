package controleur;

import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import vue_principale.New_vue_Dessin;

public class GestionPlugin {
		
	/**
	 * Copie le fichier source dans le fichier resultat Retourne vrai si cela réussit
	 * @param source
	 * @param destination
	 * @return true ou false
	 */
	public static boolean copyFile(File source, File destination) {
		
		if(destination.exists()){
			 JOptionPane.showMessageDialog(null, "Le plugin que vous voulez actuellement charger, " +
			 		"est déjà présent dans l'application");	
			 return false;
		} else {	
			try {
				// Declaration et ouverture des flux
				java.io.FileInputStream sourceFile = new java.io.FileInputStream(
						source);
	
				try {
					java.io.FileOutputStream destinationFile = null;
	
					try {
						destinationFile = new FileOutputStream(destination);
	
						// Lecture par segment de 0.5Mo
						byte buffer[] = new byte[512 * 1024];
						int nbLecture;
	
						while ((nbLecture = sourceFile.read(buffer)) != -1) {
							destinationFile.write(buffer, 0, nbLecture);
						}
					} finally {
						destinationFile.close();
					}
				} finally {
					sourceFile.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				return false; // Erreur
			}
		}	
		return true; // Résultat OK
	}

	/**
	 * Fonction pour supprimer un plugin
	 * @param filename
	 * @return
	 * @throws Exception
	 */
	public static boolean deleteFile(String filename) throws Exception {
		
		File file = new File(filename);
		if (!file.exists()) {
			throw new Exception("le fichier est introuvable !");
		}
		if (!file.canWrite()) {
			throw new Exception("Droit insuffisant pour accéder au fichier");
		}
		return file.delete();
	}
	
	/**
	 * Filtre jar
	 * @author marzilli_g
	 *
	 */
	public class FiltreSimple extends FileFilter{
		   //Description et extension acceptée par le filtre
		   private String description;
		   private String extension;
		   //Constructeur à partir de la description et de l'extension acceptée
		   public FiltreSimple(String description, String extension){
		      if(description == null || extension ==null){
		         throw new NullPointerException("La description (ou extension) ne peut être null.");
		      }
		      this.description = description;
		      this.extension = extension;
		   }
		   //Implémentation de FileFilter
		   public boolean accept(File file){
		      if(file.isDirectory()) { 
		         return true; 
		      } 
		      String nomFichier = file.getName().toLowerCase(); 
		 
		      return nomFichier.endsWith(extension);
		   }
		      public String getDescription(){
		      return description;
		   }
		}
	
	
	//TODO test restart 2
	/**
	 * @throws IOException 
	 * 
	 */
	public static void relance_moi(String nomPlugin) throws IOException
	{
		final Process process = Runtime.getRuntime().exec("java -jar ..\\EveryThing\\EveryThing.jar " + nomPlugin);
		
		// Consommation de la sortie standard de l'application externe dans un Thread separe
		new Thread() {
			public void run() {
				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
					String line = "";
					try {
						while((line = reader.readLine()) != null) {
							System.err.println("OUT:"+line);
						}
					} finally {
						reader.close();
					}
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}.start();

	// Consommation de la sortie d'erreur de l'application externe dans un Thread separe
		new Thread() {
			public void run() {
				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
					String line = "";
					try {
						while((line = reader.readLine()) != null) {
							System.err.println("ERR:"+line);
						}
					} finally {
						reader.close();
					}
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}.start();
 
//		JOptionPane.showMessageDialog(null, "Tchoutchou");
		System.exit(-1);
 
	}
	
//	//TODO test restart  + suppression
//	public static final String SUN_JAVA_COMMAND = "sun.java.command";
//	
//	public static void restartApplication(Runnable runBeforeRestart) throws IOException {
//		try {
//			// java binary
//			String java = System.getProperty("java.home") + "/bin/java";
//			// vm arguments
//			List<String> vmArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
//			StringBuffer vmArgsOneLine = new StringBuffer();
//			for (String arg : vmArguments) {
//				// if it's the agent argument : we ignore it otherwise the
//				// address of the old application and the new one will be in conflict
//				if (!arg.contains("-agentlib")) {
//					vmArgsOneLine.append(arg);
//					vmArgsOneLine.append(" ");
//				}
//			}
//			// init the command to execute, add the vm args
//			final StringBuffer cmd = new StringBuffer("\"" + java + "\" " + vmArgsOneLine);
//
//			// program main and program arguments
//			String[] mainCommand = System.getProperty(SUN_JAVA_COMMAND).split(" ");
//			// program main is a jar
//			if (mainCommand[0].endsWith(".jar")) {
//				// if it's a jar, add -jar mainJar
//				cmd.append("-jar " + new File(mainCommand[0]).getPath());
//			} else {
//				// else it's a .class, add the classpath and mainClass
//				cmd.append("-cp \"" + System.getProperty("java.class.path") + "\" " + mainCommand[0]);
//			}
//			// finally add program arguments
//			for (int i = 1; i < mainCommand.length; i++) {
//				cmd.append(" ");
//				cmd.append(mainCommand[i]);
//			}
//			// execute the command in a shutdown hook, to be sure that all the
//			// resources have been disposed before restarting the application
//			Runtime.getRuntime().addShutdownHook(new Thread() {
//				@Override
//				public void run() {
//					try {
//						Runtime.getRuntime().exec(cmd.toString());
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			});
//			// execute some custom code before restarting
//			if (runBeforeRestart!= null) {
//				runBeforeRestart.run();
//			}
//			// exit
//			System.exit(0);
//		} catch (Exception e) {
//			// something went wrong
//			throw new IOException("Error while trying to restart the application", e);
//		}
//	}
	
	//TODO autre test de restart
	public static void restartApplication2(String nom) throws URISyntaxException
	{
	  final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
	  final File currentJar = new File(New_vue_Dessin.class.getProtectionDomain().getCodeSource().getLocation().toURI());

	  /* is it a jar file? */
	  if(!currentJar.getName().endsWith(".jar"))
	    return;

	  /* Build command: java -jar application.jar */
	  final ArrayList<String> command = new ArrayList<String>();
	  command.add(javaBin);
	  command.add("-jar");
	  command.add(currentJar.getPath());

	  final ProcessBuilder builder = new ProcessBuilder(command);
	  try {
		builder.start();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.exit(0);
	}
}




