package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import java.awt.Font;

public class VueDessin extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueDessin frame = new VueDessin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		JLabel lblActionSurLes = new JLabel("Action sur les formes");
		lblActionSurLes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblActionSurLes.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblActionSurLes = new GridBagConstraints();
		gbc_lblActionSurLes.insets = new Insets(0, 0, 5, 5);
		gbc_lblActionSurLes.gridx = 2;
		gbc_lblActionSurLes.gridy = 1;
		panel_outil.add(lblActionSurLes, gbc_lblActionSurLes);
		
		JPanel panel_bouton1 = new JPanel();
		GridBagConstraints gbc_panel_bouton1 = new GridBagConstraints();
		gbc_panel_bouton1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_bouton1.fill = GridBagConstraints.BOTH;
		gbc_panel_bouton1.gridx = 2;
		gbc_panel_bouton1.gridy = 2;
		panel_outil.add(panel_bouton1, gbc_panel_bouton1);
		GridBagLayout gbl_panel_bouton1 = new GridBagLayout();
		gbl_panel_bouton1.columnWidths = new int[] {0, 0};
		gbl_panel_bouton1.rowHeights = new int[]{0, 0};
		gbl_panel_bouton1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_bouton1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_bouton1.setLayout(gbl_panel_bouton1);
		
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
		panel_bouton1.add(btnAjouterForme, gbc_btnAjouterForme);
		
		JPanel panel_bouton2 = new JPanel();
		GridBagConstraints gbc_panel_bouton2 = new GridBagConstraints();
		gbc_panel_bouton2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_bouton2.fill = GridBagConstraints.BOTH;
		gbc_panel_bouton2.gridx = 2;
		gbc_panel_bouton2.gridy = 3;
		panel_outil.add(panel_bouton2, gbc_panel_bouton2);
		GridBagLayout gbl_panel_bouton2 = new GridBagLayout();
		gbl_panel_bouton2.columnWidths = new int[] {0, 0};
		gbl_panel_bouton2.rowHeights = new int[]{0, 0};
		gbl_panel_bouton2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_bouton2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_bouton2.setLayout(gbl_panel_bouton2);
		
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
		panel_bouton2.add(btnSupprForm, gbc_btnSupprForm);
		
		JPanel panel_bouton3 = new JPanel();
		GridBagConstraints gbc_panel_bouton3 = new GridBagConstraints();
		gbc_panel_bouton3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_bouton3.fill = GridBagConstraints.BOTH;
		gbc_panel_bouton3.gridx = 2;
		gbc_panel_bouton3.gridy = 4;
		panel_outil.add(panel_bouton3, gbc_panel_bouton3);
		GridBagLayout gbl_panel_bouton3 = new GridBagLayout();
		gbl_panel_bouton3.columnWidths = new int[] {0, 0};
		gbl_panel_bouton3.rowHeights = new int[]{0, 0};
		gbl_panel_bouton3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_bouton3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_bouton3.setLayout(gbl_panel_bouton3);
		
		JButton btnLierFoorme = new JButton("Lier");
		btnLierFoorme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnLierFoorme = new GridBagConstraints();
		gbc_btnLierFoorme.fill = GridBagConstraints.BOTH;
		gbc_btnLierFoorme.weighty = 1.0;
		gbc_btnLierFoorme.weightx = 1.0;
		gbc_btnLierFoorme.gridx = 0;
		gbc_btnLierFoorme.gridy = 0;
		panel_bouton3.add(btnLierFoorme, gbc_btnLierFoorme);
		
		JLabel lblPinceaux = new JLabel("Pinceaux");
		lblPinceaux.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPinceaux.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblPinceaux = new GridBagConstraints();
		gbc_lblPinceaux.insets = new Insets(0, 0, 5, 5);
		gbc_lblPinceaux.gridx = 2;
		gbc_lblPinceaux.gridy = 5;
		panel_outil.add(lblPinceaux, gbc_lblPinceaux);
		
		JPanel panel_plug_ing = new JPanel();
		GridBagConstraints gbc_panel_plug_ing = new GridBagConstraints();
		gbc_panel_plug_ing.gridheight = 2;
		gbc_panel_plug_ing.insets = new Insets(0, 0, 0, 5);
		gbc_panel_plug_ing.fill = GridBagConstraints.BOTH;
		gbc_panel_plug_ing.gridx = 2;
		gbc_panel_plug_ing.gridy = 6;
		panel_outil.add(panel_plug_ing, gbc_panel_plug_ing);
		
		//Jpanel dessin
		JPanel panel_dessin = new JPanel();
		contentPane.add(panel_dessin, BorderLayout.CENTER);
	}

}
