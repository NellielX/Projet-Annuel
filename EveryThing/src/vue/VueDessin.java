package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.TransformGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import modele.Cube;

import com.sun.j3d.utils.universe.SimpleUniverse;

import java.awt.Font;

public class VueDessin extends JFrame {

	private JPanel contentPane;
	public static JPanel panel_plug_ing = new JPanel();

	public VueDessin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Everything in your Hands - Dessin");
		setBounds(100, 100, 953, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Jpanel haut
		JPanel panel_haut = new JPanel();
		FlowLayout fl_panel_haut = (FlowLayout) panel_haut.getLayout();
		fl_panel_haut.setVgap(20);
		panel_haut.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_haut, BorderLayout.NORTH);
		
		//Jpanel bas
		JPanel panel_bas = new JPanel();
		FlowLayout fl_panel_bas = (FlowLayout) panel_bas.getLayout();
		fl_panel_bas.setVgap(20);
		panel_bas.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_bas, BorderLayout.SOUTH);
		
		//Jpanel outils
		JPanel panel_outil = new JPanel();
		panel_outil.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_outil, BorderLayout.EAST);
		GridBagLayout gbl_panel_outil = new GridBagLayout();
		gbl_panel_outil.columnWidths = new int[] {1, 30, 0, 0, 0, 0, 0, 22};
		gbl_panel_outil.rowHeights = new int[] {30, 0, 0, 0, 0, 0, 0, 0, 30};
		gbl_panel_outil.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_outil.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_outil.setLayout(gbl_panel_outil);
		
		//Libelle : Action sur les formes
		JLabel lblActionSurLes = new JLabel("Action sur les formes");
		lblActionSurLes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblActionSurLes.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblActionSurLes = new GridBagConstraints();
		gbc_lblActionSurLes.insets = new Insets(0, 0, 5, 5);
		gbc_lblActionSurLes.gridx = 2;
		gbc_lblActionSurLes.gridy = 1;
		panel_outil.add(lblActionSurLes, gbc_lblActionSurLes);
		
		//Jpanel pour bouton ajouter
		JPanel panel_ajouter = new JPanel();
		GridBagConstraints gbc_panel_ajouter = new GridBagConstraints();
		gbc_panel_ajouter.insets = new Insets(0, 0, 5, 5);
		gbc_panel_ajouter.fill = GridBagConstraints.BOTH;
		gbc_panel_ajouter.gridx = 2;
		gbc_panel_ajouter.gridy = 2;
		panel_outil.add(panel_ajouter, gbc_panel_ajouter);
		GridBagLayout gbl_panel_bouton1 = new GridBagLayout();
		gbl_panel_bouton1.columnWidths = new int[] {0, 0};
		gbl_panel_bouton1.rowHeights = new int[]{0, 0};
		gbl_panel_bouton1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_bouton1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_ajouter.setLayout(gbl_panel_bouton1);
		
		//Bouton ajouter
		JButton btnAjouterForme = new JButton("Ajouter");
		btnAjouterForme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GridBagConstraints gbc_btnAjouterForme = new GridBagConstraints();
		gbc_btnAjouterForme.fill = GridBagConstraints.BOTH;
		gbc_btnAjouterForme.weighty = 1.0;
		gbc_btnAjouterForme.weightx = 1.0;
		gbc_btnAjouterForme.gridx = 0;
		gbc_btnAjouterForme.gridy = 0;
		panel_ajouter.add(btnAjouterForme, gbc_btnAjouterForme);
		
		//Jpanel pour bouton supprimer
		JPanel panel_supprimer = new JPanel();
		GridBagConstraints gbc_panel_supprimer = new GridBagConstraints();
		gbc_panel_supprimer.insets = new Insets(0, 0, 5, 5);
		gbc_panel_supprimer.fill = GridBagConstraints.BOTH;
		gbc_panel_supprimer.gridx = 2;
		gbc_panel_supprimer.gridy = 3;
		panel_outil.add(panel_supprimer, gbc_panel_supprimer);
		GridBagLayout gbl_panel_bouton2 = new GridBagLayout();
		gbl_panel_bouton2.columnWidths = new int[] {0, 0};
		gbl_panel_bouton2.rowHeights = new int[]{0, 0};
		gbl_panel_bouton2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_bouton2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_supprimer.setLayout(gbl_panel_bouton2);
		
		//Bouton supprimer
		JButton btnSupprForm = new JButton("Supprimer");
		btnSupprForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnSupprForm = new GridBagConstraints();
		gbc_btnSupprForm.weighty = 1.0;
		gbc_btnSupprForm.weightx = 1.0;
		gbc_btnSupprForm.fill = GridBagConstraints.BOTH;
		gbc_btnSupprForm.gridx = 0;
		gbc_btnSupprForm.gridy = 0;
		panel_supprimer.add(btnSupprForm, gbc_btnSupprForm);
		
		//Jpanel pour bouton lier
		JPanel panel_lier = new JPanel();
		GridBagConstraints gbc_panel_lier = new GridBagConstraints();
		gbc_panel_lier.insets = new Insets(0, 0, 5, 5);
		gbc_panel_lier.fill = GridBagConstraints.BOTH;
		gbc_panel_lier.gridx = 2;
		gbc_panel_lier.gridy = 4;
		panel_outil.add(panel_lier, gbc_panel_lier);
		GridBagLayout gbl_panel_bouton3 = new GridBagLayout();
		gbl_panel_bouton3.columnWidths = new int[] {0, 0};
		gbl_panel_bouton3.rowHeights = new int[]{0, 0};
		gbl_panel_bouton3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_bouton3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_lier.setLayout(gbl_panel_bouton3);
		
		//Bouton lier
		JButton btnLierForme = new JButton("Lier");
		btnLierForme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnLierFoorme = new GridBagConstraints();
		gbc_btnLierFoorme.fill = GridBagConstraints.BOTH;
		gbc_btnLierFoorme.weighty = 1.0;
		gbc_btnLierFoorme.weightx = 1.0;
		gbc_btnLierFoorme.gridx = 0;
		gbc_btnLierFoorme.gridy = 0;
		panel_lier.add(btnLierForme, gbc_btnLierFoorme);
		
		//Label pour les pinceaux
		JLabel lblPinceaux = new JLabel("Pinceaux (Plugin)");
		lblPinceaux.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPinceaux.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblPinceaux = new GridBagConstraints();
		gbc_lblPinceaux.insets = new Insets(0, 0, 5, 5);
		gbc_lblPinceaux.gridx = 2;
		gbc_lblPinceaux.gridy = 5;
		panel_outil.add(lblPinceaux, gbc_lblPinceaux);
		
		//Jpanel pour les plug-ins
		GridBagConstraints gbc_panel_plug_ing = new GridBagConstraints();
		gbc_panel_plug_ing.fill = GridBagConstraints.BOTH;
		gbc_panel_plug_ing.insets = new Insets(0, 0, 0, 5);
		gbc_panel_plug_ing.gridx = 2;
		gbc_panel_plug_ing.gridy = 6;
		panel_plug_ing.setBackground(Color.DARK_GRAY);
		panel_outil.add(panel_plug_ing, gbc_panel_plug_ing);


//		Scene3D panel_dessin = new Scene3D(Shapes3D forme);
//		contentPane.add(panel_dessin, BorderLayout.CENTER);
	}

}
