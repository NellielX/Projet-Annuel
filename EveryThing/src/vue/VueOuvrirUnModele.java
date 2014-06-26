package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class VueOuvrirUnModele {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueOuvrirUnModele window = new VueOuvrirUnModele();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VueOuvrirUnModele() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 953, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
