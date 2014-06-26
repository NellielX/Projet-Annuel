package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class VueChoixNouveauModele extends JPanel{

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
					VueChoixNouveauModele window = new VueChoixNouveauModele();
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
	public VueChoixNouveauModele() {
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
		
		//Jpanel pour le titre
		JPanel panel_titre = new JPanel();
		FlowLayout fl_panel_titre = (FlowLayout) panel_titre.getLayout();
		fl_panel_titre.setVgap(60);
		fl_panel_titre.setHgap(20);
		panel_titre.setBackground(Color.BLUE);
		frmEverythingInYour.getContentPane().add(panel_titre, BorderLayout.NORTH);
		
		//Jpanel de la page
		JPanel panel_page = new JPanel();
		frmEverythingInYour.getContentPane().add(panel_page, BorderLayout.CENTER);
		GridBagLayout gbl_panel_page = new GridBagLayout();
		gbl_panel_page.columnWidths = new int[]{0, 0, 0};
		gbl_panel_page.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_page.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_page.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_page.setLayout(gbl_panel_page);
		
		//Jpanel séparation
		JPanel panel_séparation = new JPanel();
		GridBagConstraints gbc_panel_séparation = new GridBagConstraints();
		gbc_panel_séparation.gridheight = 2;
		gbc_panel_séparation.gridwidth = 2;
		gbc_panel_séparation.insets = new Insets(0, 0, 5, 0);
		gbc_panel_séparation.fill = GridBagConstraints.BOTH;
		gbc_panel_séparation.gridx = 0;
		gbc_panel_séparation.gridy = 0;
		panel_page.add(panel_séparation, gbc_panel_séparation);
		
		//Jpanel boutons
		JPanel panel_boutons = new JPanel();
		FlowLayout fl_panel_boutons = (FlowLayout) panel_boutons.getLayout();
		fl_panel_boutons.setVgap(150);
		panel_boutons.setBackground(Color.MAGENTA);
		GridBagConstraints gbc_panel_boutons = new GridBagConstraints();
		gbc_panel_boutons.gridwidth = 2;
		gbc_panel_boutons.insets = new Insets(0, 0, 5, 0);
		gbc_panel_boutons.fill = GridBagConstraints.BOTH;
		gbc_panel_boutons.gridx = 0;
		gbc_panel_boutons.gridy = 2;
		panel_page.add(panel_boutons, gbc_panel_boutons);
	}

}
