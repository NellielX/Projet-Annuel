import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.SwingUtilities;

import vue.VuePrincipale;

public class EveryThingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			public void run(){
				try {
					new VuePrincipale();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		EventQueue.invokeLater(r);
	}

}
