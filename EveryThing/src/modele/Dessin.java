package modele;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import java.util.Vector;

public class Dessin extends BufferedImage{
	
	private ColorModel cm;
	private WritableRaster wr;
	private Vector<Calque> listCalque;
	private int idCalqueCourant;
	
	private Forme formeCourante;
	
	public Dessin(int width, int height, int type){
		super(width,height,type);
		this.cm = super.getColorModel();
		this.wr = super.getRaster();
		listCalque = new Vector<Calque>();
		Calque calque_ref = new Calque(0);
		listCalque.add(calque_ref);
		idCalqueCourant = 0;
	}

	public Dessin(ColorModel cm, WritableRaster wr, boolean arg2,
			Hashtable<?, ?> arg3) {
		super(cm, wr, arg2, arg3);
		this.cm = cm;
		this.wr = wr;
		listCalque = new Vector<Calque>();
		Calque calque_ref = new Calque(0);
		listCalque.add(calque_ref);
		idCalqueCourant = 0;
		// TODO Auto-generated constructor stub
	}
	
	public ColorModel getCm() {
		return cm;
	}

	public void setCm(ColorModel cm) {
		this.cm = cm;
	}

	public WritableRaster getWr() {
		return wr;
	}

	public void setWr(WritableRaster wr) {
		this.wr = wr;
	}
	
	public int getIdCalqueCourant() {
		return idCalqueCourant;
	}

	public void setIdCalqueCourant(int idCalqueCourant) {
		this.idCalqueCourant = idCalqueCourant;
	}
	
	public Vector<Calque> getListCalque(){
		return listCalque;
	}

	public void setListCalque(Vector<Calque> listCalque) {
		this.listCalque = listCalque;
	}

	public Forme getFormeCourante() {
		return formeCourante;
	}

	public void setFormeCourante(Forme formeCourante) {
		this.formeCourante = formeCourante;
	}

	public void ajouterCalque(Calque c) {
		this.listCalque.add(c);
	}
	
	public void supprimerCalque(Calque c) {
		this.listCalque.remove(c.getId());
	}
	
	public void majId() {
		// TODO Auto-generated method stub
		for(int i=0; i<this.getListCalque().size(); i++){
			this.getListCalque().get(i).setId(i);
		}
	}
	
	public void paint(Graphics2D g){
		for(Calque element : this.getListCalque()){
			element.paint(g);
		}
	}

	public Calque getCalqueCourant(int idCalqueCourant) {
		return this.listCalque.elementAt(idCalqueCourant);
	}


}
