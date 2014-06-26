package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;

public class VueDessin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public VueDessin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Everything in your Hands");
		setBounds(100, 100, 953, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Jpanel haut
		JPanel panel_haut = new JPanel();
		FlowLayout fl_panel_haut = (FlowLayout) panel_haut.getLayout();
		fl_panel_haut.setVgap(20);
		panel_haut.setBackground(new Color(0, 102, 204));
		contentPane.add(panel_haut, BorderLayout.NORTH);
		
		//Jpanel bas
		JPanel panel_bas = new JPanel();
		FlowLayout fl_panel_bas = (FlowLayout) panel_bas.getLayout();
		fl_panel_bas.setVgap(20);
		panel_bas.setBackground(new Color(0, 102, 204));
		contentPane.add(panel_bas, BorderLayout.SOUTH);
		
		//Jpanel outils
		JPanel panel_outil = new JPanel();
		FlowLayout fl_panel_outil = (FlowLayout) panel_outil.getLayout();
		fl_panel_outil.setHgap(100);
		panel_outil.setBackground(new Color(102, 51, 153));
		contentPane.add(panel_outil, BorderLayout.EAST);
		
		//Jpanel dessin
		JPanel panel_dessin = new JPanel();
		contentPane.add(panel_dessin, BorderLayout.CENTER);
	}

}
