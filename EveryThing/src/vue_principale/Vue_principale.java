package vue_principale;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.JButton;

import vue.VueChoixNouveauModele;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Vue_principale extends JPanel{

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
					Vue_principale window = new Vue_principale();
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
	public Vue_principale() {
		initialize();
	}
	

	  public void paintComponent(Graphics g){
	    try {
	      Image img = ImageIO.read(new File("../images/logo.png"));
	      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }                
	  }               
		

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEverythingInYour = new JFrame();
		frmEverythingInYour.setTitle("Everything in your Hands");
		frmEverythingInYour.setBounds(100, 100, 953, 615);
		frmEverythingInYour.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//Jpanel de la bannière
		JPanel panel_titre = new JPanel();
		FlowLayout fl_panel_titre = (FlowLayout) panel_titre.getLayout();
		fl_panel_titre.setHgap(20);
		panel_titre.setBackground(new Color(255, 255, 255));
		panel_titre.setForeground(new Color(0, 0, 0));     
		frmEverythingInYour.getContentPane().add(panel_titre, BorderLayout.NORTH);
		
		JButton btnTest = new JButton("");
		btnTest.setForeground(new Color(255, 255, 255));
		btnTest.setBackground(new Color(255, 255, 255));
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTest.setIcon(new ImageIcon("C:\\Users\\Ga\u00EBtan\\Documents\\GitHub\\Projet-Annuel\\EveryThing\\images\\logo.png"));
		panel_titre.add(btnTest);
		
		//Jpanel des boutons
		JPanel panel_bouton = new JPanel();
		panel_bouton.setBackground(SystemColor.menu);
		frmEverythingInYour.getContentPane().add(panel_bouton, BorderLayout.CENTER);
		GridBagLayout gbl_panel_bouton = new GridBagLayout();
		gbl_panel_bouton.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_bouton.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_bouton.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_bouton.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_bouton.setLayout(gbl_panel_bouton);
		
		//Liste des boutons
		//Crée une nouvelle forme
		JButton btnNewForme = new JButton("Cr\u00E9er une nouvelle forme");
		btnNewForme.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewForme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		          new VueChoixNouveauModele();
			}

		});
		GridBagConstraints gbc_btnNewForme = new GridBagConstraints();
		gbc_btnNewForme.weighty = 10.0;
		gbc_btnNewForme.weightx = 6.0;
		gbc_btnNewForme.fill = GridBagConstraints.BOTH;
		gbc_btnNewForme.gridwidth = 10;
		gbc_btnNewForme.gridheight = 6;
		gbc_btnNewForme.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewForme.gridx = 5;
		gbc_btnNewForme.gridy = 2;
		panel_bouton.add(btnNewForme, gbc_btnNewForme);
		
		//Bouton ouvrir un modèle
		JButton btnOuvrirModele = new JButton("Ouvrir un mod\u00E8le");
		btnOuvrirModele.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOuvrirModele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnOuvrirModele = new GridBagConstraints();
		gbc_btnOuvrirModele.weighty = 10.0;
		gbc_btnOuvrirModele.weightx = 6.0;
		gbc_btnOuvrirModele.fill = GridBagConstraints.BOTH;
		gbc_btnOuvrirModele.gridwidth = 10;
		gbc_btnOuvrirModele.gridheight = 6;
		gbc_btnOuvrirModele.insets = new Insets(0, 0, 5, 5);
		gbc_btnOuvrirModele.gridx = 20;
		gbc_btnOuvrirModele.gridy = 2;
		panel_bouton.add(btnOuvrirModele, gbc_btnOuvrirModele);
		
		//Bouton paramètre
		JButton btnParametres = new JButton("Param\u00E8tres");
		btnParametres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnParametres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnParametres = new GridBagConstraints();
		gbc_btnParametres.weighty = 10.0;
		gbc_btnParametres.weightx = 6.0;
		gbc_btnParametres.gridwidth = 10;
		gbc_btnParametres.gridheight = 6;
		gbc_btnParametres.fill = GridBagConstraints.BOTH;
		gbc_btnParametres.insets = new Insets(0, 0, 5, 5);
		gbc_btnParametres.gridx = 5;
		gbc_btnParametres.gridy = 9;
		panel_bouton.add(btnParametres, gbc_btnParametres);
		
		//Bouton exit
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.weighty = 10.0;
		gbc_btnExit.weightx = 6.0;
		gbc_btnExit.insets = new Insets(0, 0, 5, 5);
		gbc_btnExit.gridwidth = 10;
		gbc_btnExit.gridheight = 6;
		gbc_btnExit.fill = GridBagConstraints.BOTH;
		gbc_btnExit.gridx = 20;
		gbc_btnExit.gridy = 9;
		panel_bouton.add(btnExit, gbc_btnExit);
	}

}
