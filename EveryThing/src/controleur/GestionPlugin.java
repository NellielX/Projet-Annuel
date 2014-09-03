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
	 * @author marzilli_g
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
	 * @author marzilli_g
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
	
	/**
	 * Permet de relancer l'application en envoyer le chemin du .jar à supprimer au main lors du redémarrage.
	 * @throws IOException 
	 * @author marzilli_g
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
 
		System.exit(-1);
 
	}
}




