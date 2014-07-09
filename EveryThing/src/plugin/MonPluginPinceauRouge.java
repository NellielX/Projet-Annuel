package plugin;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.media.j3d.ColoringAttributes;
import javax.swing.JButton;
import javax.swing.JOptionPane;



public class MonPluginPinceauRouge implements PluginFunction {

	public String getPluginName() {
		System.out.println("Pinceau rouge");
		return "Pinceau rouge";
	}

	public void addItem() {
		JButton btnPinceauRouge = new JButton("Pinceau rouge");
		btnPinceauRouge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ceci est un beau pinceau rouge !");
				
			}
		});
		vue.VueDessin.panel_plug_ing.add(btnPinceauRouge);
		vue.VueDessin.panel_plug_ing.revalidate();
	}


	
}
