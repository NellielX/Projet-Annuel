package plugin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MonPluginPinceauVert implements PluginFunction{

	public String getPluginName() {
		System.out.println("Pinceau rouge");
		return "Pinceau rouge";
	}

	public void addItem() {
		
		int width = 150;
	    int height = 70;
	    Dimension dim = new Dimension(width, height);
	    
		JButton btnPinceauVert = new JButton("Pinceau vert");
		btnPinceauVert.setPreferredSize(dim);
		
		btnPinceauVert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ceci est un beau pinceau vert !");
				
			}
		});
		vue.VueDessin.panel_plug_ing.add(btnPinceauVert);
		vue.VueDessin.panel_plug_ing.revalidate();
	}
}
