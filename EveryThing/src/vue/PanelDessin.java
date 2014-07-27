package vue;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import modele.Dessin;

public class PanelDessin extends JPanel {
	
	private Dessin draw;
	
	public PanelDessin(Dessin draw){
		this.draw = draw;
	}
	
	
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		if(draw.getListPoint() != null){
			for (int i =0; i< draw.getListPoint().size(); i++) {
				Color c = Color.red;
				g.setColor(c);
				g.drawOval((int)draw.getListPoint(i).getX(), (int)draw.getListPoint(i).getY(), 10, 10);
			}
		}
		draw.setListPoint(null);
	}

}