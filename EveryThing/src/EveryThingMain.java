import java.awt.EventQueue;

import javax.swing.JOptionPane;

import controleur.GestionPlugin;

//import listeners.PanelDessinListener;
//import modele.Dessin;
//
//import com.leapmotion.leap.Controller;
//
//import plugin.PluginsLoader;
import vue_principale.New_vue_Dessin;

public class EveryThingMain {

	public static void main(String[] args) {

		if (args.length > 0){
			try {
				JOptionPane.showMessageDialog(null, "Tchoutchou");
				GestionPlugin.deleteFile(args[0]);
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

