import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JOptionPane;

import controleur.GestionPlugin;
import vue_principale.New_vue_Dessin;

public class EveryThingMain {

	public static void main(String[] args) {

		if (args.length > 0){
			try {
				Thread.sleep(500);
				JOptionPane.showMessageDialog(null, "L'application redémarre afin de permettre la suppression du plugin.");
				controleur.GestionPlugin.deleteFile(args[0]);
				JOptionPane.showMessageDialog(null, "Le plugin " + args[0] + " à été supprimé avec succès !");
				Desktop desk = Desktop.getDesktop();
				desk.open(new File("Everything.bat"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		Runnable r = new Runnable() {
			public void run(){
				New_vue_Dessin vuePrincipale = new New_vue_Dessin();
				vuePrincipale.setVisible(true);
			}
		};
		EventQueue.invokeLater(r);
		//Chargement des plugins
		plugin.PluginsLoader pl = new plugin.PluginsLoader();
		
	}
}

