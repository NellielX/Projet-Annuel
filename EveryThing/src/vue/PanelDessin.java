package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.leapmotion.leap.Controller;

import listeners.PanelDessinListener;
import listeners.PanelDessinMouseListener;
import modele.Dessin;

public class PanelDessin extends JPanel {
	
	private Dessin d;
	private Controller c;
	
	public PanelDessin(Dessin d){
		this.d = d;
		c = new Controller();
		c.addListener(new PanelDessinListener(this, d));
		this.addMouseListener(new PanelDessinMouseListener(this, d));
	}
	
	
	public void paintComponent(Graphics2D g){
		//Dessine le fond du panel en blanc
		g.setBackground(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		//Dessine l'ensemble des axes en commencant par le dernier
		//Pour gérer la transparence
		for(int i=d.getListCalque().size(); i==0 ; i--){
			d.getListCalque().get(i).paint(g);
		}
	}
}
