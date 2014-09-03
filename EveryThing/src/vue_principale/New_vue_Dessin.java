package vue_principale;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import vue.PanelCalque;
import vue.PanelDessin;
import vue.PanelOutil;
import vue.VueInformations;
import vue.VueParametres;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;

import modele.Dessin;

import java.awt.SystemColor;
import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Set;

public class New_vue_Dessin extends JFrame {

	private Dessin d;
	private PanelDessin pde;
	private JPanel contentPane;
	public static JPanel panel_plugin_couleurs = new JPanel();
	public static JPanel panel_pour_outils = new JPanel();
	public static JPanel panel_pour_calques = new JPanel();
	private PanelOutil outil ;
	private PanelCalque calques;
	
	
	public New_vue_Dessin() {
		setTitle("Everything in your Hands - Dessin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 615);
		setResizable(false);
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
		mntmNouveau.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(d==null){
					pde.setBackground(Color.WHITE);
					d = new Dessin(pde.getWidth(),pde.getHeight(),BufferedImage.TYPE_3BYTE_BGR);
					outil.setDessin(d);
					calques.setDessin(d);
				    System.out.println("Dessin crée");
				}
				else{
					System.out.println("Un dessin est en cours. Veuillez quitter avant d'en lancer un nouveau");
				}
			}
		});
		mnMenu.add(mntmNouveau);
		
		//Bouton ouvrir
		JMenuItem mntmOuvrir = new JMenuItem("Ouvrir");
		mnMenu.add(mntmOuvrir);
		mntmOuvrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Component parent = null;
				JFileChooser choix = new JFileChooser();
				choix.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int retour=choix.showOpenDialog(parent);
				if(retour==JFileChooser.APPROVE_OPTION){
				   // un fichier a été choisi (sortie par OK)
				   // nom du fichier  choisi 
				   choix.getSelectedFile().getName();
				   // chemin absolu du fichier choisi
				   choix.getSelectedFile().getAbsolutePath();
				}	
			}
		});
		
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
		
		//Bouton ajouter un plugin
		JMenuItem mntmAjouter = new JMenuItem("Ajouter ");
		mnPlugins.add(mntmAjouter);
		mntmAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Component parent = null;
				//Fenetre pour choix du plugin
				JFileChooser choix = new JFileChooser();
				choix.setFileSelectionMode(JFileChooser.FILES_ONLY);
				choix.setAcceptAllFileFilterUsed(false);
				//Filtrage des points jar
				FileNameExtensionFilter filtre = new FileNameExtensionFilter("Plugin (.jar)", "jar");
				choix.setFileFilter(filtre);
				choix.setMultiSelectionEnabled(false);
			
				int retour=choix.showOpenDialog(parent);
				if(retour==JFileChooser.APPROVE_OPTION){
				   File fichier = new File(choix.getSelectedFile().getAbsolutePath());
				   File destination = new File(".." + File.separator + "EveryThing" + File.separator + "plugin" + File.separator + choix.getSelectedFile().getName() );
				   if (controleur.GestionPlugin.copyFile(fichier, destination) == true){
					   plugin.PluginsLoader pl = new plugin.PluginsLoader();
					   JOptionPane.showMessageDialog(null, "Le plugin '" + choix.getSelectedFile().getName() + "' à été charger avec succès.");
				   }
//				   } else {
//					   JOptionPane.showMessageDialog(null, "Un problème lors du chargement du plugin à été détecté.");
//				   }
				}	
			}
		});
		
		//Bouton supprimer un plugin
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mnPlugins.add(mntmSupprimer);
		mntmSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Component parent = null;
				//Fenetre pour choix du plugin
				JFileChooser choix = new JFileChooser();
				choix.setFileSelectionMode(JFileChooser.FILES_ONLY);
				choix.setAcceptAllFileFilterUsed(false);
				//Dossier par defaut
				choix.setCurrentDirectory(new File(".." + File.separator + "Everything" + File.separator + "plugin"));
				//Filtrage des points jar
				FileNameExtensionFilter filtre = new FileNameExtensionFilter("Plugin (.jar)", "jar");
				choix.setFileFilter(filtre);
				choix.setMultiSelectionEnabled(false);
				//Changement du bouton et du commentaire de la fenêtre de suppression de plugin
				choix.setApproveButtonText("Supprimer");
				choix.setApproveButtonToolTipText("Suppression du plugin selectionner");			 
				int retour=choix.showOpenDialog(parent);
				if(retour==JFileChooser.APPROVE_OPTION){	
					   try {	
						   controleur.GestionPlugin.relance_moi(choix.getSelectedFile().getAbsolutePath());
					} catch (Exception e) {
						e.printStackTrace();
					}   
				   
				}				  
			}
		});
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Jpanel dessin
		JPanel panel_dessin = new JPanel();
		pde = new PanelDessin(d);
		FlowLayout flowLayout = (FlowLayout) pde.getLayout();
		flowLayout.setVgap(270);
		flowLayout.setHgap(375);
		panel_dessin.add(pde);
		panel_dessin.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_dessin, BorderLayout.CENTER);
		
		//Jpanel barre 
		JPanel panel_couleurs = new JPanel();
		contentPane.add(panel_couleurs, BorderLayout.EAST);
		GridBagLayout gbl_panel_couleurs = new GridBagLayout();
		gbl_panel_couleurs.columnWidths = new int[] {0, 0, 180};
		gbl_panel_couleurs.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_couleurs.columnWeights = new double[]{0.0, 1.0, 1.0};
		gbl_panel_couleurs.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
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
				panel_plugin_couleurs.removeAll();
				panel_plugin_couleurs.repaint();
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
				System.out.println(System.getProperty("java.class.path"));
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
				JOptionPane.showMessageDialog(null, "Ceci est un beau pinceau gris !");
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
		gbc_panel_plugin_couleurs.fill = GridBagConstraints.BOTH;
		gbc_panel_plugin_couleurs.gridx = 2;
		gbc_panel_plugin_couleurs.gridy = 1;
		panel_couleurs.add(panel_plugin_couleurs, gbc_panel_plugin_couleurs);
		FlowLayout flowLayout_1 = (FlowLayout) panel_pour_calques.getLayout();
		flowLayout_1.setHgap(0);
		flowLayout_1.setVgap(0);
		
		//Jpanel pour inclure les calques
		calques = new PanelCalque(d);
		GridBagConstraints gbc_panel_pour_calques = new GridBagConstraints();
		gbc_panel_pour_calques.weighty = 3.0;
		gbc_panel_pour_calques.insets = new Insets(10, 10, 5, 10);
		gbc_panel_pour_calques.fill = GridBagConstraints.BOTH;
		gbc_panel_pour_calques.gridx = 2;
		gbc_panel_pour_calques.gridy = 2;
		panel_couleurs.add(panel_pour_calques, gbc_panel_pour_calques);
		FlowLayout flowLayout_2 = (FlowLayout) panel_pour_outils.getLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		
		//Jpanel pour inclure les outils
		outil = new PanelOutil(d);
		GridBagConstraints gbc_panel_pour_outils = new GridBagConstraints();
		gbc_panel_pour_outils.weighty = 3.0;
		gbc_panel_pour_outils.fill = GridBagConstraints.BOTH;
		gbc_panel_pour_outils.insets = new Insets(0, 10, 0, 10);
		gbc_panel_pour_outils.gridx = 2;
		gbc_panel_pour_outils.gridy = 13;
		panel_couleurs.add(panel_pour_outils, gbc_panel_pour_outils);
	}

}
