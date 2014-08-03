package vue_principale;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import vue.VueInformations;
import vue.VueParametres;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import java.awt.SystemColor;

public class New_vue_Dessin extends JFrame {

	private JPanel contentPane;
	public static JPanel panel_plugin_couleurs = new JPanel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_vue_Dessin frame = new New_vue_Dessin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public New_vue_Dessin() {
		setTitle("Everything in your Hands - Dessin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 615);
	     int width = 50;
	     int height = 50;
	     Dimension dim = new Dimension(width, height);
	     
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Menu fichier
		JMenu mnMenu = new JMenu("Fichier");
		menuBar.add(mnMenu);
		
		//Bouton nouveau
		JMenuItem mntmNouveau = new JMenuItem("Nouveau");
		mnMenu.add(mntmNouveau);
		
		//Bouton ouvrir
		JMenuItem mntmOuvrir = new JMenuItem("Ouvrir");
		mnMenu.add(mntmOuvrir);
		
		//Bouton sauver
		JMenuItem mntmSauvegarder = new JMenuItem("Sauver");
		mnMenu.add(mntmSauvegarder);
		
		//Bouton a propos
		JMenuItem mntmAPropos = new JMenuItem("A propos");
		mnMenu.add(mntmAPropos);
		mntmAPropos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VueInformations variable = new VueInformations(); 
				variable.setVisible(true); 
			}
		});
		
		//Bouton quitter
		JMenuItem mntmFermer = new JMenuItem("Quitter");
		mnMenu.add(mntmFermer);
		mntmFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		//Menu parametre
		JMenu mnParamtres = new JMenu("Param\u00E8tres");
		menuBar.add(mnParamtres);
		
		//Bouton parametres
		JMenuItem mntmParamtresDeLapplication = new JMenuItem("Param\u00E8tres de l'application");
		mnParamtres.add(mntmParamtresDeLapplication);
		mntmParamtresDeLapplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VueParametres parametre = new VueParametres(); 
				parametre.setVisible(true); 
			}
		});
		
		//Bouton parametre Leap
		JMenuItem mntmParamtresDuLeap = new JMenuItem("Param\u00E8tres du Leap Motion");
		mnParamtres.add(mntmParamtresDuLeap);
		
		//Menu plugins
		JMenu mnPlugins = new JMenu("Plugins");
		menuBar.add(mnPlugins);
		
		//Bouton ajouter
		JMenuItem mntmAjouter = new JMenuItem("Ajouter ");
		mnPlugins.add(mntmAjouter);
		
		//Bouton supprimer
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mnPlugins.add(mntmSupprimer);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Jpanel dessin
		JPanel panel_dessin = new JPanel();
		panel_dessin.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_dessin.setBackground(Color.WHITE);
		contentPane.add(panel_dessin, BorderLayout.CENTER);
		
		//Jpanel barre 
		JPanel panel_couleurs = new JPanel();
		contentPane.add(panel_couleurs, BorderLayout.EAST);
		GridBagLayout gbl_panel_couleurs = new GridBagLayout();
		gbl_panel_couleurs.columnWidths = new int[] {0, 0, 180};
		gbl_panel_couleurs.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_couleurs.columnWeights = new double[]{0.0, 1.0, 1.0};
		gbl_panel_couleurs.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_couleurs.setLayout(gbl_panel_couleurs);
		
		//Jpanel pour les bouton de couleurs
		JPanel panel_bouton_couleurs = new JPanel();
		panel_bouton_couleurs.setBackground(SystemColor.menu);
		GridBagConstraints gbc_panel_bouton_couleurs = new GridBagConstraints();
		gbc_panel_bouton_couleurs.insets = new Insets(0, 10, 5, 0);
		gbc_panel_bouton_couleurs.gridwidth = 2;
		gbc_panel_bouton_couleurs.fill = GridBagConstraints.BOTH;
		gbc_panel_bouton_couleurs.gridx = 1;
		gbc_panel_bouton_couleurs.gridy = 0;
		panel_couleurs.add(panel_bouton_couleurs, gbc_panel_bouton_couleurs);
		GridBagLayout gbl_panel_bouton_couleurs = new GridBagLayout();
		gbl_panel_bouton_couleurs.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_bouton_couleurs.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_bouton_couleurs.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_bouton_couleurs.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_bouton_couleurs.setLayout(gbl_panel_bouton_couleurs);
		
		//Bouton rouge
		JButton btnRouge = new JButton("");
		btnRouge.setBackground(Color.RED);
		btnRouge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnRouge = new GridBagConstraints();
		gbc_btnRouge.insets = new Insets(0, 0, 5, 5);
		gbc_btnRouge.gridx = 0;
		gbc_btnRouge.gridy = 1;
		btnRouge.setPreferredSize(dim);
		panel_bouton_couleurs.add(btnRouge, gbc_btnRouge);
		
		//Bouton rose
		JButton btnRose = new JButton("");
		btnRose.setBackground(Color.PINK);
		btnRose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnRose = new GridBagConstraints();
		gbc_btnRose.insets = new Insets(0, 0, 5, 5);
		gbc_btnRose.gridx = 1;
		gbc_btnRose.gridy = 1;
		btnRose.setPreferredSize(dim);
		panel_bouton_couleurs.add(btnRose, gbc_btnRose);
		
		//Bouton bleu
		JButton btnBleu = new JButton("");
		btnBleu.setBackground(Color.BLUE);
		btnBleu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnBleu = new GridBagConstraints();
		gbc_btnBleu.insets = new Insets(0, 0, 5, 0);
		gbc_btnBleu.gridx = 2;
		gbc_btnBleu.gridy = 1;
		btnBleu.setPreferredSize(dim);
		panel_bouton_couleurs.add(btnBleu, gbc_btnBleu);
		
		//Bouton jaune
		JButton btnJaune = new JButton("");
		btnJaune.setBackground(Color.YELLOW);
		btnJaune.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJaune = new GridBagConstraints();
		gbc_btnJaune.insets = new Insets(0, 0, 5, 5);
		gbc_btnJaune.gridx = 0;
		gbc_btnJaune.gridy = 2;
		btnJaune.setPreferredSize(dim);
		panel_bouton_couleurs.add(btnJaune, gbc_btnJaune);
		
		//Bouton orange
		JButton btnOrange = new JButton("");
		btnOrange.setBackground(Color.ORANGE);
		btnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnOrange = new GridBagConstraints();
		gbc_btnOrange.insets = new Insets(0, 0, 5, 5);
		gbc_btnOrange.gridx = 1;
		gbc_btnOrange.gridy = 2;
		btnOrange.setPreferredSize(dim);
		panel_bouton_couleurs.add(btnOrange, gbc_btnOrange);
		
		//Bouton violet
		JButton btnViolet = new JButton("");
		btnViolet.setBackground(new Color(153, 50, 204));
		btnViolet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnViolet = new GridBagConstraints();
		gbc_btnViolet.insets = new Insets(0, 0, 5, 0);
		gbc_btnViolet.gridx = 2;
		gbc_btnViolet.gridy = 2;
		btnViolet.setPreferredSize(dim);
		panel_bouton_couleurs.add(btnViolet, gbc_btnViolet);
		
		//Bouton noir
		JButton btnNoir = new JButton("");
		btnNoir.setBackground(Color.BLACK);
		btnNoir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNoir = new GridBagConstraints();
		gbc_btnNoir.insets = new Insets(0, 0, 0, 5);
		gbc_btnNoir.gridx = 0;
		gbc_btnNoir.gridy = 3;
		btnNoir.setPreferredSize(dim);
		panel_bouton_couleurs.add(btnNoir, gbc_btnNoir);
		
		//Bouton blanc
		JButton btnBlanc = new JButton("");
		btnBlanc.setBackground(Color.WHITE);
		btnBlanc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnBlanc = new GridBagConstraints();
		gbc_btnBlanc.insets = new Insets(0, 0, 0, 5);
		gbc_btnBlanc.gridx = 1;
		gbc_btnBlanc.gridy = 3;
		btnBlanc.setPreferredSize(dim);
		panel_bouton_couleurs.add(btnBlanc, gbc_btnBlanc);
		
		//Bouton vert
		JButton btnVert = new JButton("");
		btnVert.setBackground(new Color(154, 205, 50));
		btnVert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnVert = new GridBagConstraints();
		gbc_btnVert.gridx = 2;
		gbc_btnVert.gridy = 3;
		btnVert.setPreferredSize(dim);
		panel_bouton_couleurs.add(btnVert, gbc_btnVert);
		
		//Jpanel plugins palette couleur
		FlowLayout fl_panel_plugin_couleurs = (FlowLayout) panel_plugin_couleurs.getLayout();
		fl_panel_plugin_couleurs.setVgap(1);
		fl_panel_plugin_couleurs.setHgap(1);
		panel_plugin_couleurs.setBackground(SystemColor.menu);
		GridBagConstraints gbc_panel_plugin_couleurs = new GridBagConstraints();
		gbc_panel_plugin_couleurs.insets = new Insets(0, 0, 200, 0);
		gbc_panel_plugin_couleurs.fill = GridBagConstraints.BOTH;
		gbc_panel_plugin_couleurs.gridx = 2;
		gbc_panel_plugin_couleurs.gridy = 1;
		panel_couleurs.add(panel_plugin_couleurs, gbc_panel_plugin_couleurs);
	}

}
