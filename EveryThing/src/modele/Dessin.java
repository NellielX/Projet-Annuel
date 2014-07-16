package modele;

import java.util.ArrayList;

import LeapMotion.Doigt;

public class Dessin {
	
	private ArrayList<Point> listPoint;
	
	public Dessin( ArrayList<Point> listPoint ){
		this.listPoint = new ArrayList<Point> ();
		for(int i=0; i<listPoint.size(); i++){
			this.listPoint.add(listPoint.get(i));
		}
	}
	
	public Dessin() {
	}

	public void ajouterPoint(Point p1){
		if(p1 != null && this.listPoint != null){
			this.listPoint.add(p1);
		}
	}
	
	public ArrayList<Point> getListPoint() {
		return listPoint;
	}

	public void setListPoint(ArrayList<Point> listPoint) {
		this.listPoint = listPoint;
	}
	
	public String toString(){
		String s = "";
		for(int i=0; i<this.listPoint.size(); i++)
			s+=this.listPoint.toString();
		return s;
	}

	public Point getListPoint(int i) {
		if(this.listPoint != null && this.listPoint.size() < i && i > 0){
			return null;
		}
		else
			return this.listPoint.get(i);
	}

}
