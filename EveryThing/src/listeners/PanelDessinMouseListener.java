package listeners;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;

import vue.PanelDessin;
import vue.PanelOutil;
import modele.Dessin;

public class PanelDessinMouseListener implements MouseListener{

	private Dessin d;
	private PanelDessin v;
	
	public PanelDessinMouseListener(PanelDessin v, Dessin d) {
		// TODO Auto-generated constructor stub
		this.d = d;
		this.v = v;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("-"+getD().getFormeCourante().toString());
		if(getD().getFormeCourante() != null && e.getClickCount()==1){
			System.out.println((int)e.getX()+" - "+(int)e.getY());
			Point2D p = null;
			p.setLocation((int)e.getX(), (int)e.getY());
			getD().getFormeCourante().ajouterPoint(p);
			getV().paintComponent((Graphics2D)v.getGraphics());
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Mouse entered");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Exit");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Released");
	}

	public Dessin getD() {
		return d;
	}

	public void setD(Dessin d) {
		this.d = d;
	}

	public PanelDessin getV() {
		return v;
	}

	public void setV(PanelDessin v) {
		this.v = v;
	}
	

}
