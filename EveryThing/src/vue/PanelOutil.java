package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import listeners.OutilListener;
import listeners.PanelDessinMouseListener;
import modele.Dessin;

public class PanelOutil extends JPanel{
	
	private JButton ligne;
	private JButton rectangle;
	
	public PanelOutil(Dessin draw){
		setLayout(new FlowLayout());
		
//		ligne = new JButton("Ligne"); //mettre une image apres
//		rectangle = new JButton("Rectangle");
//		
//		ligne.addMouseListener(new OutilListener(this, draw));
//		rectangle.addMouseListener(new OutilListener(this, draw));
//		
//		add(ligne);
//		add(rectangle);
//		
//		vue_principale.New_vue_Dessin.panel_pour_outils.add(ligne);
//		vue_principale.New_vue_Dessin.panel_pour_outils.add(rectangle);
//		vue_principale.New_vue_Dessin.panel_pour_outils.revalidate();
		
		int width = 150;
	    int height = 50;
	    Dimension dim = new Dimension(width, height);
	    
	    //Jpanel outils
	    JPanel panel_outils = new JPanel();
		panel_outils.setBackground(SystemColor.menu);
		GridBagLayout gbl_panel_outils = new GridBagLayout();
		gbl_panel_outils.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_outils.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_outils.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_outils.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_outils.setLayout(gbl_panel_outils);
		
		vue_principale.New_vue_Dessin.panel_pour_outils.add(panel_outils);
		
		//Jbutton ligne
		JButton btnOutilLigne = new JButton("");
		btnOutilLigne.setName("ligne");
		btnOutilLigne.setPreferredSize(dim);	
		btnOutilLigne.setBackground(Color.GRAY);
		btnOutilLigne.addActionListener(new OutilListener(this, draw));
		GridBagConstraints gbc_btnOutilLigne = new GridBagConstraints();
		gbc_btnOutilLigne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOutilLigne.gridx = 5;
		gbc_btnOutilLigne.gridy = 1;
		panel_outils.add(btnOutilLigne, gbc_btnOutilLigne);
		
		//Jbutton rectangle
		JButton btnOutilRectangle = new JButton("Rectangle");
		btnOutilRectangle.setPreferredSize(dim);	
		btnOutilRectangle.setBackground(Color.GRAY);
		btnOutilRectangle.addActionListener(new OutilListener(this, draw));
		GridBagConstraints gbc_btnOutilRectangle = new GridBagConstraints();
		gbc_btnOutilRectangle.insets = new Insets(0, 0, 5, 5);
		gbc_btnOutilRectangle.gridx = 5;
		gbc_btnOutilRectangle.gridy = 2;
		panel_outils.add(btnOutilRectangle, gbc_btnOutilRectangle);
		vue_principale.New_vue_Dessin.panel_pour_outils.revalidate();
		
	}

	public JButton getLigne() {
		return ligne;
	}

	public void setLigne(JButton ligne) {
		this.ligne = ligne;
	}

	public JButton getRectangle() {
		return rectangle;
	}

	public void setRectangle(JButton rectangle) {
		this.rectangle = rectangle;
	}

}
