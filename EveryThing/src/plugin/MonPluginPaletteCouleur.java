package plugin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vue_principale.New_vue_Dessin;

public class MonPluginPaletteCouleur implements PluginFunction {
	
	public String getPluginName() {
		System.out.println("Palette de couleurs");
		return "Palette de couleurs";
	}

	public void addItem() {	
	    int width = 50;
	    int height = 50;
	    Dimension dim = new Dimension(width, height);
	    
	    JPanel panel_couleurs = new JPanel();
		panel_couleurs.setBackground(SystemColor.menu);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_couleurs.setLayout(gbl_panel);
		
		//Jbutton pinceau gris
		JButton btnPinceauGris = new JButton("");
		btnPinceauGris.setPreferredSize(dim);	
		btnPinceauGris.setBackground(Color.GRAY);
		btnPinceauGris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ceci est un beau pinceau gris !");
			}
		});
		GridBagConstraints gbc_btnPinceauGris = new GridBagConstraints();
		gbc_btnPinceauGris.insets = new Insets(0, 0, 0, 5);
		gbc_btnPinceauGris.gridx = 1;
		gbc_btnPinceauGris.gridy = 3;
		panel_couleurs.add(btnPinceauGris, gbc_btnPinceauGris);
		
		//Jbutton pinceau marron
		JButton btnPinceauMarron = new JButton("");
		btnPinceauMarron.setPreferredSize(dim);	
		btnPinceauMarron.setBackground(new Color(139, 69, 19));
		btnPinceauMarron.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ceci est un beau pinceau marron !");
			}
		});
		GridBagConstraints gbc_btnPinceauMarron = new GridBagConstraints();
		gbc_btnPinceauMarron.insets = new Insets(0, 0, 0, 5);
		gbc_btnPinceauMarron.gridx = 3;
		gbc_btnPinceauMarron.gridy = 3;
		panel_couleurs.add(btnPinceauMarron, gbc_btnPinceauMarron);
		
		//Jbutton pinceau cyan
		JButton btnPinceauCyan = new JButton("");
		btnPinceauCyan.setPreferredSize(dim);	
		btnPinceauCyan.setBackground(new Color(0, 191, 255));
		btnPinceauCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ceci est un beau pinceau cyan !");
			}
		});
		GridBagConstraints gbc_btnPinceauCyan = new GridBagConstraints();
		gbc_btnPinceauCyan.gridx = 5;
		gbc_btnPinceauCyan.gridy = 3;
		panel_couleurs.add(btnPinceauCyan, gbc_btnPinceauCyan);
			
		vue_principale.New_vue_Dessin.panel_plugin_couleurs.add(panel_couleurs);
		vue_principale.New_vue_Dessin.panel_plugin_couleurs.revalidate();
	}
}
