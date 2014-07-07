package vue_principale;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import vue.VueChoixNouveauModele;
import vue.VueInformations;
import vue.VueOuvrirUnModele;
import vue.VueParametres;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.SystemColor;

public class VuePrincipale extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {

			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VuePrincipale frame = new VuePrincipale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public VuePrincipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Everything in your Hands");
	    setBounds(100, 100, 953, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Jpanel de la bannière
		JPanel panel_titre = new JPanel();
		panel_titre.setBackground(SystemColor.menu);
		contentPane.add(panel_titre, BorderLayout.NORTH);
		
		//Bouton information
		JButton btnInformation = new JButton("");
		btnInformation.setBackground(SystemColor.menu);
		btnInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VueInformations variable = new VueInformations(); 
				variable.setVisible(true); 
			}
		});
		btnInformation.setForeground(Color.WHITE);
		btnInformation.setIcon(new ImageIcon("..\\EveryThing\\images\\logo.png"));
		panel_titre.add(btnInformation);
		
		//Jpanel des boutons
		JPanel panel_boutons = new JPanel();
		contentPane.add(panel_boutons, BorderLayout.CENTER);
		GridBagLayout gbl_panel_boutons = new GridBagLayout();
		gbl_panel_boutons.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_boutons.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_boutons.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_boutons.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_boutons.setLayout(gbl_panel_boutons);
		
		//Liste des boutons
		//Crée une nouvelle forme
		JButton btnNewForme = new JButton("Cr\u00E9er une nouvelle forme");
		btnNewForme.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewForme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VueChoixNouveauModele newModele = new VueChoixNouveauModele(); 
				newModele.setVisible(true); 
			}
		});
		GridBagConstraints gbc_btnNewForme = new GridBagConstraints();
		gbc_btnNewForme.fill = GridBagConstraints.BOTH;
		gbc_btnNewForme.weighty = 10.0;
		gbc_btnNewForme.weightx = 6.0;
		gbc_btnNewForme.gridwidth = 10;
		gbc_btnNewForme.gridheight = 6;
		gbc_btnNewForme.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewForme.gridx = 5;
		gbc_btnNewForme.gridy = 2;
		panel_boutons.add(btnNewForme, gbc_btnNewForme);
		
		//Bouton ouvrir un modèle
		JButton btnOuvrirModele = new JButton("Ouvrir un mod\u00E8le");
		btnOuvrirModele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VueOuvrirUnModele ouvrirModele = new VueOuvrirUnModele(); 
				ouvrirModele.setVisible(true);
			}
		});
		btnOuvrirModele.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnOuvrirModele = new GridBagConstraints();
		gbc_btnOuvrirModele.weighty = 10.0;
		gbc_btnOuvrirModele.weightx = 6.0;
		gbc_btnOuvrirModele.fill = GridBagConstraints.BOTH;
		gbc_btnOuvrirModele.gridwidth = 10;
		gbc_btnOuvrirModele.gridheight = 6;
		gbc_btnOuvrirModele.insets = new Insets(0, 0, 5, 0);
		gbc_btnOuvrirModele.gridx = 20;
		gbc_btnOuvrirModele.gridy = 2;
		panel_boutons.add(btnOuvrirModele, gbc_btnOuvrirModele);
		
		//Bouton paramètre
		JButton btnParametres = new JButton("Param\u00E8tres");
		btnParametres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VueParametres parametre = new VueParametres(); 
				parametre.setVisible(true); 
			}
		});
		btnParametres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnParametres = new GridBagConstraints();
		gbc_btnParametres.weighty = 10.0;
		gbc_btnParametres.weightx = 6.0;
		gbc_btnParametres.fill = GridBagConstraints.BOTH;
		gbc_btnParametres.gridwidth = 10;
		gbc_btnParametres.gridheight = 6;
		gbc_btnParametres.insets = new Insets(0, 0, 0, 5);
		gbc_btnParametres.gridx = 5;
		gbc_btnParametres.gridy = 9;
		panel_boutons.add(btnParametres, gbc_btnParametres);
		
		//Bouton exit
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.weighty = 10.0;
		gbc_btnExit.weightx = 6.0;
		gbc_btnExit.gridwidth = 10;
		gbc_btnExit.gridheight = 6;
		gbc_btnExit.fill = GridBagConstraints.BOTH;
		gbc_btnExit.gridx = 20;
		gbc_btnExit.gridy = 9;
		panel_boutons.add(btnExit, gbc_btnExit);
	}

}
