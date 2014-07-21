import java.awt.EventQueue;

import listeners.PanelDessinListener;
import modele.Dessin;

import com.leapmotion.leap.Controller;

import plugin.PluginsLoader;
import vue_principale.VuePrincipale;


public class EveryThingMain {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run(){
				Controller c = new Controller();
				PanelDessinListener pdl = new PanelDessinListener(null, null);
				VuePrincipale vuePrincipale = new VuePrincipale();
				c.addListener(pdl);
				Dessin d = new Dessin();
				pdl.setDraw(d);
				vuePrincipale.setVisible(true);
			}
		};
		EventQueue.invokeLater(r);
		plugin.PluginsLoader pl = new plugin.PluginsLoader();
	}

}
