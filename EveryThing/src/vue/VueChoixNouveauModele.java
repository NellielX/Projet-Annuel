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
		panel_haut.setBackground(new Color(0, 102, 204));
		contentPane.add(panel_haut, BorderLayout.NORTH);
		
		//Jpanel centre
		JPanel panel_centre = new JPanel();
		contentPane.add(panel_centre, BorderLayout.CENTER);
		GridBagLayout gbl_panel_centre = new GridBagLayout();
		gbl_panel_centre.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_centre.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_centre.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_centre.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_centre.setLayout(gbl_panel_centre);
		
		//Jpanel pour choix des modeles
		JPanel panel_choix = new JPanel();
		panel_choix.setBackground(new Color(204, 153, 255));
		GridBagConstraints gbc_panel_choix = new GridBagConstraints();
		gbc_panel_choix.gridwidth = 12;
		gbc_panel_choix.gridheight = 7;
		gbc_panel_choix.insets = new Insets(0, 0, 5, 5);
		gbc_panel_choix.fill = GridBagConstraints.BOTH;
		gbc_panel_choix.gridx = 0;
		gbc_panel_choix.gridy = 0;
		panel_centre.add(panel_choix, gbc_panel_choix);
		
		//Jpanel pour bouton
		JPanel panel_bouton = new JPanel();
		GridBagConstraints gbc_panel_bouton = new GridBagConstraints();
		gbc_panel_bouton.gridwidth = 12;
		gbc_panel_bouton.fill = GridBagConstraints.BOTH;
		gbc_panel_bouton.gridx = 0;
		gbc_panel_bouton.gridy = 7;
		panel_centre.add(panel_bouton, gbc_panel_bouton);
		
		//Bouton valider
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VueDessin vueDessin = new VueDessin(); 
				vueDessin.setVisible(true);
			}
		});
		panel_bouton.add(btnValider);
		
		//Jpanel bas
		JPanel panel_bas = new JPanel();
		FlowLayout fl_panel_bas = (FlowLayout) panel_bas.getLayout();
		fl_panel_bas.setVgap(60);
		fl_panel_bas.setHgap(20);
		panel_bas.setBackground(new Color(0, 102, 204));
		contentPane.add(panel_bas, BorderLayout.SOUTH);
	}

}
