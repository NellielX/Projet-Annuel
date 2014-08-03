package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class VueInformations extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VueInformations() {
		setTitle("Everything in your Hands - Informations");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 725, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Jpanel Haut
		JPanel panel_nord = new JPanel();
		FlowLayout fl_panel_nord = (FlowLayout) panel_nord.getLayout();
		fl_panel_nord.setVgap(20);
		contentPane.add(panel_nord, BorderLayout.NORTH);
		
		//Jpanel Gauche
		JPanel panel_gauche = new JPanel();
		FlowLayout fl_panel_gauche = (FlowLayout) panel_gauche.getLayout();
		fl_panel_gauche.setHgap(20);
		contentPane.add(panel_gauche, BorderLayout.WEST);
		
		//Jpanel Bas
		JPanel panel_bas = new JPanel();
		FlowLayout fl_panel_bas = (FlowLayout) panel_bas.getLayout();
		fl_panel_bas.setVgap(20);
		contentPane.add(panel_bas, BorderLayout.SOUTH);
		
		//Jpanel Droite
		JPanel panel_droite = new JPanel();
		FlowLayout fl_panel_droite = (FlowLayout) panel_droite.getLayout();
		fl_panel_droite.setHgap(20);
		contentPane.add(panel_droite, BorderLayout.EAST);
		
		//Jpanel Centre
		JPanel panel_centre = new JPanel();
		contentPane.add(panel_centre, BorderLayout.CENTER);
		GridBagLayout gbl_panel_centre = new GridBagLayout();
		gbl_panel_centre.columnWidths = new int[]{0, 0, 0};
		gbl_panel_centre.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_centre.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_centre.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_centre.setLayout(gbl_panel_centre);
		
		//Label : Qu'est-ce que Everything in your Hands?
		JLabel lblQuesqueEverythingIn = new JLabel("Qu'est-ce que Everything in your Hands?");
		lblQuesqueEverythingIn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblQuesqueEverythingIn = new GridBagConstraints();
		gbc_lblQuesqueEverythingIn.anchor = GridBagConstraints.WEST;
		gbc_lblQuesqueEverythingIn.insets = new Insets(0, 0, 5, 0);
		gbc_lblQuesqueEverythingIn.gridx = 1;
		gbc_lblQuesqueEverythingIn.gridy = 1;
		panel_centre.add(lblQuesqueEverythingIn, gbc_lblQuesqueEverythingIn);
		
		//Zone pour le texte
		JPanel panel_P1 = new JPanel();
		GridBagConstraints gbc_panel_P1 = new GridBagConstraints();
		gbc_panel_P1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_P1.fill = GridBagConstraints.BOTH;
		gbc_panel_P1.gridx = 1;
		gbc_panel_P1.gridy = 2;
		panel_centre.add(panel_P1, gbc_panel_P1);
		
		//Label : Comment utiliser Everything ?
		JLabel lblCommentUtiliserEverything = new JLabel("Comment utiliser Everything ?");
		lblCommentUtiliserEverything.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblCommentUtiliserEverything = new GridBagConstraints();
		gbc_lblCommentUtiliserEverything.insets = new Insets(0, 0, 5, 0);
		gbc_lblCommentUtiliserEverything.anchor = GridBagConstraints.WEST;
		gbc_lblCommentUtiliserEverything.gridx = 1;
		gbc_lblCommentUtiliserEverything.gridy = 4;
		panel_centre.add(lblCommentUtiliserEverything, gbc_lblCommentUtiliserEverything);
		
		//Zone pour le texte
		JPanel panel_P2 = new JPanel();
		GridBagConstraints gbc_panel_P2 = new GridBagConstraints();
		gbc_panel_P2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_P2.fill = GridBagConstraints.BOTH;
		gbc_panel_P2.gridx = 1;
		gbc_panel_P2.gridy = 5;
		panel_centre.add(panel_P2, gbc_panel_P2);
		
		//Label : Updates
		JLabel lblUpdates = new JLabel("Updates");
		lblUpdates.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblUpdates = new GridBagConstraints();
		gbc_lblUpdates.insets = new Insets(0, 0, 5, 0);
		gbc_lblUpdates.anchor = GridBagConstraints.WEST;
		gbc_lblUpdates.gridx = 1;
		gbc_lblUpdates.gridy = 7;
		panel_centre.add(lblUpdates, gbc_lblUpdates);
		
		//Zone pour le texte
		JPanel panel_P3 = new JPanel();
		GridBagConstraints gbc_panel_P3 = new GridBagConstraints();
		gbc_panel_P3.fill = GridBagConstraints.BOTH;
		gbc_panel_P3.gridx = 1;
		gbc_panel_P3.gridy = 8;
		panel_centre.add(panel_P3, gbc_panel_P3);
	}

}
