package controleur;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.swing.JOptionPane;

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
		
}