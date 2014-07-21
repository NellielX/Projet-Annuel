package listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vue.PanelDessin;
import modele.Dessin;

public class PanelDessinMouseListener implements MouseListener{

	private Dessin draw;
	private PanelDessin view;
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("clic");
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

	public PanelDessin getView() {
		return view;
	}

	public void setView(PanelDessin view) {
		this.view = view;
	}

	public Dessin getDraw() {
		return draw;
	}

	public void setDraw(Dessin draw) {
		this.draw = draw;
	}

}
