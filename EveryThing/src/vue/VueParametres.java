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

public class VueParametres extends JFrame {

	private JPanel contentPane;

	public VueParametres() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Everything in your Hands - Param\u00E8tres");
		setBounds(100, 100, 353, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Jpanel haut
		JPanel panel_haut = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_haut.getLayout();
		flowLayout.setVgap(20);
		contentPane.add(panel_haut, BorderLayout.NORTH);
		
		//Jpanel gauche
		JPanel panel_gauche = new JPanel();
		FlowLayout fl_panel_gauche = (FlowLayout) panel_gauche.getLayout();
		fl_panel_gauche.setHgap(20);
		contentPane.add(panel_gauche, BorderLayout.WEST);
		
		//Jpanel bas
		JPanel panel_bas = new JPanel();
		FlowLayout fl_panel_bas = (FlowLayout) panel_bas.getLayout();
		fl_panel_bas.setVgap(20);
		contentPane.add(panel_bas, BorderLayout.SOUTH);
		
		//Jpanel droite
		JPanel panel_droite = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_droite.getLayout();
		flowLayout_1.setHgap(20);
		contentPane.add(panel_droite, BorderLayout.EAST);
		
		//Jpanel centre
		JPanel panel_centre = new JPanel();
		contentPane.add(panel_centre, BorderLayout.CENTER);
		GridBagLayout gbl_panel_centre = new GridBagLayout();
		gbl_panel_centre.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_centre.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_centre.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_centre.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_centre.setLayout(gbl_panel_centre);
		
		//Label : Parametres
		JLabel lblParamtres = new JLabel("Param\u00E8tres");
		lblParamtres.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblParamtres = new GridBagConstraints();
		gbc_lblParamtres.insets = new Insets(0, 0, 5, 5);
		gbc_lblParamtres.gridx = 1;
		gbc_lblParamtres.gridy = 1;
		panel_centre.add(lblParamtres, gbc_lblParamtres);
		
		
	}
	
	

}
