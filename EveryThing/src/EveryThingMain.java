import java.awt.EventQueue;

import plugin.PluginsLoader;
import vue_principale.VuePrincipale;


public class EveryThingMain {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run(){
				VuePrincipale vuePrincipale = new VuePrincipale();
				vuePrincipale.setVisible(true);
			}
		};
		EventQueue.invokeLater(r);
		plugin.PluginsLoader pl = new plugin.PluginsLoader();
	}

}
