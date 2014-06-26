import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.SwingUtilities;

import vue_principale.Vue_principale;

public class EveryThingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			public void run(){
				new Vue_principale();
			}
		};
		EventQueue.invokeLater(r);
	}

}
