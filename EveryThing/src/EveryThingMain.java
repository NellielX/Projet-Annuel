import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.SwingUtilities;

import vue_principale.Vue_principale;

public class EveryThingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			public void run(){
				Vue_principale vuePrincipale = new Vue_principale(); 
				vuePrincipale.setVisible(true);
			}
		};
		EventQueue.invokeLater(r);
	}

}
