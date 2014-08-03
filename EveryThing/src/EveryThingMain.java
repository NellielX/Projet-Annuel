import java.awt.EventQueue;

//import listeners.PanelDessinListener;
//import modele.Dessin;
//
//import com.leapmotion.leap.Controller;
//
//import plugin.PluginsLoader;
import vue_principale.New_vue_Dessin;



public class EveryThingMain {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run(){
//				Controller c = new Controller();
//				PanelDessinListener pdl = new PanelDessinListener(null, null);
				New_vue_Dessin vuePrincipale = new New_vue_Dessin();
//				c.addListener(pdl);
//				Dessin d = new Dessin();
//				pdl.setDraw(d);
				vuePrincipale.setVisible(true);
			}
		};
		EventQueue.invokeLater(r);
		plugin.PluginsLoader pl = new plugin.PluginsLoader();
	}

}
