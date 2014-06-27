import java.awt.EventQueue;
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
	}

}
