package listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vue.PanelOutil;
import modele.Dessin;
import modele.Ligne;
import modele.Rectangle;

public class OutilListener implements MouseListener{
	
	private Dessin d;
	private PanelOutil po;
	
	public OutilListener(PanelOutil panelOutil, Dessin draw) {
		// TODO Auto-generated constructor stub
		d = draw;
		po = panelOutil;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()=="ligne"){
			Ligne l = new Ligne();
			d.getCalqueCourant(d.getCalqueCourant()).addForme(l);
			d.setFormeCourante(l);
		}
		else if(e.getSource()=="rectangle"){
			d.getCalqueCourant(d.getCalqueCourant()).addForme(new Rectangle());
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
