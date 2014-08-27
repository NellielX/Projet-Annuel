package vue;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import listeners.PanelDessinMouseListener;

public class PanelOutil extends JPanel{
	
	private JButton ligne;
	
	public PanelOutil(){
		setLayout(new FlowLayout());
		ligne = new JButton("Ligne"); //mettre une image apres
		
		ligne.addMouseListener(new PanelDessinMouseListener(this, draw));
		
		add(ligne);
	}

}
