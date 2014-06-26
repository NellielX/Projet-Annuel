package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

public class VueDessin extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmEverythingInYour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueDessin window = new VueDessin();
					window.frmEverythingInYour.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VueDessin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEverythingInYour = new JFrame();
		frmEverythingInYour.setTitle("Everything in your Hands");
		frmEverythingInYour.setBounds(100, 100, 953, 615);
		frmEverythingInYour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Jpanel haut
		JPanel panel_haut = new JPanel();
		FlowLayout fl_panel_haut = (FlowLayout) panel_haut.getLayout();
		fl_panel_haut.setVgap(20);
		panel_haut.setBackground(Color.BLUE);
		panel_haut.setForeground(Color.BLACK);
		frmEverythingInYour.getContentPane().add(panel_haut, BorderLayout.NORTH);
		
		//Jpanel bas
		JPanel panel_bas = new JPanel();
		FlowLayout fl_panel_bas = (FlowLayout) panel_bas.getLayout();
		fl_panel_bas.setVgap(20);
		panel_bas.setBackground(Color.MAGENTA);
		frmEverythingInYour.getContentPane().add(panel_bas, BorderLayout.SOUTH);
		
		//Jpanel pour les outils
		JPanel panel_outils = new JPanel();
		panel_outils.setBackground(Color.GRAY);
		FlowLayout fl_panel_outils = (FlowLayout) panel_outils.getLayout();
		fl_panel_outils.setHgap(100);
		frmEverythingInYour.getContentPane().add(panel_outils, BorderLayout.EAST);
		
		//Jpanel pour l'espace dessin
		JPanel panel_dessin = new JPanel();
		frmEverythingInYour.getContentPane().add(panel_dessin, BorderLayout.CENTER);
	}

}
