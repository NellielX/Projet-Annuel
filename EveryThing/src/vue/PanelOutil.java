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
	
	private Dessin d;
	private JButton btnOutilLigne;
	private JButton btnOutilRectangle;
	private OutilListener ol;
	
	public PanelOutil(Dessin d){
		this.d = d;
		setLayout(new FlowLayout());
				
		int width = 75;
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
		
		ol = new OutilListener(this, this.d);
						
		//Jbutton ligne
		btnOutilLigne = new JButton("Ligne");
		btnOutilLigne.setName("ligne");
		btnOutilLigne.setPreferredSize(dim);
		btnOutilLigne.addActionListener(ol);
		GridBagConstraints gbc_btnOutilLigne = new GridBagConstraints();
		gbc_btnOutilLigne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOutilLigne.gridx = 5;
		gbc_btnOutilLigne.gridy = 5;
		panel_outils.add(btnOutilLigne, gbc_btnOutilLigne);
			
		//Jbutton rectangle
		btnOutilRectangle = new JButton("Rect.");
		btnOutilRectangle.setPreferredSize(dim);	
		btnOutilRectangle.addActionListener(ol);
		GridBagConstraints gbc_btnOutilRectangle = new GridBagConstraints();
		gbc_btnOutilRectangle.insets = new Insets(0, 0, 5, 5);
		gbc_btnOutilRectangle.gridx = 6;
		gbc_btnOutilRectangle.gridy = 5;
		panel_outils.add(btnOutilRectangle, gbc_btnOutilRectangle);
		
		vue_principale.New_vue_Dessin.panel_pour_outils.add(panel_outils);
		vue_principale.New_vue_Dessin.panel_pour_outils.revalidate();
		
	}

	public JButton getLigne() {
		return btnOutilLigne;
	}

	public void setLigne(JButton ligne) {
		this.btnOutilLigne = ligne;
	}

	public JButton getRectangle() {
		return btnOutilRectangle;
	}

	public void setRectangle(JButton rectangle) {
		this.btnOutilRectangle = rectangle;
	}

	public Dessin getDessin() {
		return d;
	}

	public void setDessin(Dessin d) {
		this.d = d;
	}
	
	public void majDessin(Dessin d){
		btnOutilLigne.removeActionListener(ol);
		ol = null;
		ol = new OutilListener(this, this.d);
		ol.setD(d);
		btnOutilLigne.addActionListener(ol);
		System.out.println("PanelOutil : Dessin mis a jour");
		this.revalidate();
		this.repaint();
	}

}
