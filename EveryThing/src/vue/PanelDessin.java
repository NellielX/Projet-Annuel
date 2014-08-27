package vue;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.leapmotion.leap.Controller;

import listeners.PanelDessinListener;
import listeners.PanelDessinMouseListener;
import modele.Dessin;

public class PanelDessin extends JPanel {
	
	private Dessin draw;
	private Controller c;
	
	public PanelDessin(Dessin draw){
		this.draw = draw;
		c = new Controller();
		c.addListener(new PanelDessinListener(this, draw));
		this.addMouseListener(new PanelDessinMouseListener(this, draw));
	}
	
	
	public void paintComponent(Graphics g){
		//Dessine le fond du panel en blanc
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
	}
}
