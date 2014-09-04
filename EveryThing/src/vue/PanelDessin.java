package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import listeners.PanelDessinMouseListener;
import modele.Calque;
import modele.Dessin;
import modele.Forme;

public class PanelDessin extends JPanel {
	
	private Dessin d;
	private PanelDessinMouseListener pdm;
	
	public PanelDessin(Dessin d){
		this.d = d;
		pdm = new PanelDessinMouseListener(this, d);
		this.addMouseListener(pdm);
		this.setVisible(true);
	}
		
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		for(Calque c: getD().getListCalque()){
			for(Forme f: c.getContenuList()){
				f.paintComponent(g);
			}
		}
	}
	
	public void majDessin(Dessin d){
		this.removeMouseListener(pdm);
		pdm = null;
		pdm = new PanelDessinMouseListener(this, getD());
	}

	public Dessin getD() {
		return d;
	}

	public void setD(Dessin d) {
		this.d = d;
	}

	public PanelDessinMouseListener getPdm() {
		return pdm;
	}

	public void setPdm(PanelDessinMouseListener pdm) {
		this.pdm = pdm;
	}
}
