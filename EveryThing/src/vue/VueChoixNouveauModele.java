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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class VueChoixNouveauModele extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueChoixNouveauModele frame = new VueChoixNouveauModele();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VueChoixNouveauModele() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Everything in your Hands - Choix du nouveau mod\u00E8le");
		setBounds(100, 100, 953, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Jpanel haut
		JPanel panel_haut = new JPanel();
		FlowLayout fl_panel_haut = (FlowLayout) panel_haut.getLayout();
		fl_panel_haut.setVgap(60);
		fl_panel_haut.setHgap(20);
		panel_haut.setBackground(SystemColor.menu);
		contentPane.add(panel_haut, BorderLayout.NORTH);
		
		//Libelle : Choisir le modele de base de votre construction
		JLabel lblChoisirLeModle = new JLabel("Choisir le mod\u00E8le de base de votre construction");
		lblChoisirLeModle.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_haut.add(lblChoisirLeModle);
		
		//Jpanel centre
		JPanel panel_centre = new JPanel();
		panel_centre.setBackground(SystemColor.menu);
		contentPane.add(panel_centre, BorderLayout.CENTER);
		GridBagLayout gbl_panel_centre = new GridBagLayout();
		gbl_panel_centre.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_centre.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_centre.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_centre.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_centre.setLayout(gbl_panel_centre);
		
		//Jpanel pour bouton Cube
		JPanel panel_cube = new JPanel();
		panel_cube.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel_cube = new GridBagConstraints();
		gbc_panel_cube.gridwidth = 2;
		gbc_panel_cube.gridheight = 4;
		gbc_panel_cube.weighty = 1.0;
		gbc_panel_cube.weightx = 1.0;
		gbc_panel_cube.insets = new Insets(0, 0, 5, 5);
		gbc_panel_cube.fill = GridBagConstraints.BOTH;
		gbc_panel_cube.gridx = 3;
		gbc_panel_cube.gridy = 2;
		panel_centre.add(panel_cube, gbc_panel_cube);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_cube.setLayout(gbl_panel);
		
		//Bouton new cube
		JButton btnNewCube = new JButton("");
		btnNewCube.setBackground(SystemColor.menu);
		btnNewCube.setForeground(SystemColor.menu);
		btnNewCube.setIcon(new ImageIcon("..\\Everything\\images\\cube2.png"));
		btnNewCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnNewCube = new GridBagConstraints();
		gbc_btnNewCube.weighty = 1.0;
		gbc_btnNewCube.fill = GridBagConstraints.BOTH;
		gbc_btnNewCube.weightx = 1.0;
		gbc_btnNewCube.gridx = 0;
		gbc_btnNewCube.gridy = 0;
		panel_cube.add(btnNewCube, gbc_btnNewCube);
		
		//Jpanel pour bouton sphere
		JPanel panel_sphere = new JPanel();
		panel_sphere.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel_sphere = new GridBagConstraints();
		gbc_panel_sphere.gridwidth = 2;
		gbc_panel_sphere.gridheight = 4;
		gbc_panel_sphere.weighty = 5.0;
		gbc_panel_sphere.weightx = 1.0;
		gbc_panel_sphere.insets = new Insets(0, 0, 5, 5);
		gbc_panel_sphere.fill = GridBagConstraints.BOTH;
		gbc_panel_sphere.gridx = 7;
		gbc_panel_sphere.gridy = 2;
		panel_centre.add(panel_sphere, gbc_panel_sphere);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_sphere.setLayout(gbl_panel_1);
		
		//Bouton new sphere
		JButton btnNewSphere = new JButton("");
		btnNewSphere.setBackground(SystemColor.menu);
		btnNewSphere.setIcon(new ImageIcon("..\\Everything\\images\\sphere2.png"));
		btnNewSphere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnNewSphere = new GridBagConstraints();
		gbc_btnNewSphere.fill = GridBagConstraints.BOTH;
		gbc_btnNewSphere.weighty = 1.0;
		gbc_btnNewSphere.weightx = 1.0;
		gbc_btnNewSphere.gridx = 0;
		gbc_btnNewSphere.gridy = 0;
		panel_sphere.add(btnNewSphere, gbc_btnNewSphere);
		
		//Jpanel bas
		JPanel panel_bas = new JPanel();
		FlowLayout fl_panel_bas = (FlowLayout) panel_bas.getLayout();
		fl_panel_bas.setVgap(60);
		fl_panel_bas.setHgap(20);
		panel_bas.setBackground(SystemColor.menu);
		contentPane.add(panel_bas, BorderLayout.SOUTH);
		
		//Bouton retour
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_bas.add(btnRetour);
	}

}
