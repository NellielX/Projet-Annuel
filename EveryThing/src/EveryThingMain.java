import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.SwingUtilities;

import vue_principale.VuePrincipale;
import vue_principale.Vue_principale;

public class EveryThingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			public void run(){
				try {
					new Vue_principale();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		EventQueue.invokeLater(r);
	}

}
