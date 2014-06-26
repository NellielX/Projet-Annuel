package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.FlowLayout;

public class VueParametres extends JPanel{

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
					VueParametres window = new VueParametres();
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
	public VueParametres() {
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
		
		//Jpanel haut
		JPanel panel_haut = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_haut.getLayout();
		flowLayout_3.setVgap(10);
		panel_haut.setBackground(Color.MAGENTA);
		frmEverythingInYour.getContentPane().add(panel_haut, BorderLayout.NORTH);
		
		//Jpanel bas
		JPanel panel_bas = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_bas.getLayout();
		flowLayout_2.setVgap(10);
		panel_bas.setBackground(Color.GREEN);
		frmEverythingInYour.getContentPane().add(panel_bas, BorderLayout.SOUTH);
		
		//Jpanel gauche
		JPanel panel_gauche = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_gauche.getLayout();
		flowLayout.setHgap(20);
		panel_gauche.setBackground(Color.YELLOW);
		frmEverythingInYour.getContentPane().add(panel_gauche, BorderLayout.WEST);
		
		//Jpanel droite
		JPanel panel_droit = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_droit.getLayout();
		flowLayout_1.setHgap(10);
		panel_droit.setBackground(Color.ORANGE);
		frmEverythingInYour.getContentPane().add(panel_droit, BorderLayout.EAST);
		
		//Jpanel milieu
		JPanel panel_milieu = new JPanel();
		frmEverythingInYour.getContentPane().add(panel_milieu, BorderLayout.CENTER);
		GridBagLayout gbl_panel_milieu = new GridBagLayout();
		gbl_panel_milieu.columnWidths = new int[]{0, 0, 0};
		gbl_panel_milieu.rowHeights = new int[]{0, 0, 0};
		gbl_panel_milieu.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_milieu.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_milieu.setLayout(gbl_panel_milieu);
		
		JLabel lblParamtres = new JLabel("Param\u00E8tres");
		lblParamtres.setFont(new Font("Tahoma", Font.PLAIN, 35));
		GridBagConstraints gbc_lblParamtres = new GridBagConstraints();
		gbc_lblParamtres.gridx = 1;
		gbc_lblParamtres.gridy = 1;
		panel_milieu.add(lblParamtres, gbc_lblParamtres);
	}

}
