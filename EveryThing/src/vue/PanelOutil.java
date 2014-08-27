package vue;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import listeners.OutilListener;
import listeners.PanelDessinMouseListener;
import modele.Dessin;

public class PanelOutil extends JPanel{
	
	private JButton ligne;
	
	public PanelOutil(Dessin draw){
		setLayout(new FlowLayout());
		ligne = new JButton("Ligne"); //mettre une image apres
		
		ligne.addMouseListener(new OutilListener(this, draw));
		
		add(ligne);
	}

}
