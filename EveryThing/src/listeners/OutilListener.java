package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import vue.PanelOutil;
import modele.Dessin;
import modele.Ligne;
import modele.Rectangle;

public class OutilListener implements ActionListener{
	
	private Dessin d;
	private PanelOutil po;
	
	public OutilListener(PanelOutil panelOutil, Dessin draw) {
		d = draw;
		setPo(panelOutil);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("click");
		System.out.println(e.getSource().toString());
		if( ((JButton) e.getSource()).getName() == "ligne"){
			System.out.println("ligne");
			Ligne l = new Ligne();
			System.out.println(getD());
			System.out.println(getD().getIdCalqueCourant());
			getD().getCalqueCourant(getD().getIdCalqueCourant()).addForme(l);
			getD().setFormeCourante(l);
		}
		else if(e.getSource()==po.getRectangle()){
			getD().getCalqueCourant(getD().getIdCalqueCourant()).addForme(new Rectangle());
		}
	}

	public Dessin getD() {
		return d;
	}

	public void setD(Dessin d) {
		this.d = d;
	}

	public PanelOutil getPo() {
		return po;
	}

	public void setPo(PanelOutil po) {
		this.po = po;
	}

	
}
