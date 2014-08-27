package listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vue.PanelDessin;
import vue.PanelOutil;
import modele.Dessin;

public class PanelDessinMouseListener implements MouseListener{

	private Dessin draw;
	private PanelDessin view;
	
	public PanelDessinMouseListener(PanelDessin panelDessin, Dessin d) {
		// TODO Auto-generated constructor stub
		draw = d;
		view = panelDessin;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("clic");
		//faudra faire un traitement pour chaque bouton de forme comme paint
		
		
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
