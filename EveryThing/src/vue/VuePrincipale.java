package vue;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VuePrincipale extends JFrame {
	
	private Dimension screenSize;
	private BorderLayout gestAlignement_JFrame;
	private Container cont_JFrame;
	private PanelHaut panneauHaut;
	private JPanel panneauBas;
	
	public VuePrincipale() throws IOException{
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width/2,screenSize.height/2);
		setResizable(true);
		setLocationRelativeTo(null);
		this.setTitle("EveryThing in your Hands");
		
		cont_JFrame = this.getContentPane();
		gestAlignement_JFrame = new BorderLayout();
		cont_JFrame.setLayout(gestAlignement_JFrame);
		
		System.out.println(System.getProperty("user.dir"));
		panneauHaut = new PanelHaut(ImageIO.read(new File(System.getProperty("user.dir")+"\\images\\logo.png")));
		panneauHaut.setLayout(new BorderLayout());
		//panneauHaut.add(image_bandeau, BorderLayout.CENTER);
		cont_JFrame.add(panneauHaut);
		
		panneauBas = new JPanel();
		
		
		GridBagLayout  gbl = new GridBagLayout() ;
		panneauBas.setLayout(gbl);
		GridBagConstraints gbc = new GridBagConstraints() ;
				
		//1ère ligne
			
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		JButton jb1 = new JButton("Créer une nouvelle forme");
		gbc.fill = GridBagConstraints.BOTH;
		panneauBas.add(jb1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		JButton jb2 = new JButton("Ouvrir un modele");
		gbc.fill = GridBagConstraints.BOTH;
		panneauBas.add(jb2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		JButton jb3 = new JButton("Paramètres");
		gbc.fill = GridBagConstraints.BOTH;
		panneauBas.add(jb3, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		JButton jb4 = new JButton("Quitter");
		gbc.fill = GridBagConstraints.BOTH;
		panneauBas.add(jb4, gbc);
			
			
			
		//2e ligne
		cont_JFrame.add(panneauBas);
		
		//pack();
		setVisible(true);
	}
	

}
