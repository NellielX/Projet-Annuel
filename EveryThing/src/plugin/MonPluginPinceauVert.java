package plugin;

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
		JButton btnPinceauVert = new JButton("Pinceau vert");
		btnPinceauVert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ceci est un beau pinceau vert !");
				
			}
		});
		vue.VueDessin.panel_plug_ing.add(btnPinceauVert);
		vue.VueDessin.panel_plug_ing.revalidate();
	}
}
