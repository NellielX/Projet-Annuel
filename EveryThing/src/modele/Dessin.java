package modele;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import java.util.Vector;

public class Dessin extends BufferedImage{
	
	private ColorModel cm;
	private WritableRaster wr;
	private Vector<Calque> listCalque;

	public Dessin(ColorModel arg0, WritableRaster arg1, boolean arg2,
			Hashtable<?, ?> arg3) {
		super(arg0, arg1, arg2, arg3);
		listCalque = new Vector<Calque>();
		Calque calque_ref = new Calque(0);
		listCalque.add(calque_ref);
		// TODO Auto-generated constructor stub
	}
	
	public void ajouterCalque(Calque c) {
		this.listCalque.add(c);
	}
	
	public void supprimerCalque(Calque c) {
		this.listCalque.remove(c.getId());
	}
	
	public Vector<Calque> getListCalque(){
		return listCalque;
	}

	public void majId() {
		// TODO Auto-generated method stub
		for(int i=0; i<this.getListCalque().size(); i++){
			this.getListCalque().get(i).setId(i);
		}
	}


	
	

}
