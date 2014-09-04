package modele;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;

public abstract class Forme implements Shape{
	
	private int id;
	private Point2D[] tabPoints;
	private int compteurPoint;
	private Color c1;
	
	/* --- GETTERS AND SETTERS --- */
	public void setId(int id){
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public Color getC1() {
		return c1;
	}

	public void setC1(Color c1) {
		this.c1 = c1;
	}
	
	public Point2D[] getTabPoints() {
		return tabPoints;
	}
	
	public void init(Point2D[] tabPoints){
		this.tabPoints = tabPoints;
	}
	
	public void setTabPoints(Point2D[] tabPoints) {
		compteurPoint = 0;
		for(int i=0; i<tabPoints.length; i++){
			this.tabPoints[i] = tabPoints[i];
			compteurPoint = compteurPoint + 1;
		}
	}
	
	public int getCompteurPoint(){
		return this.compteurPoint;
	}
	
	public void setCompteurPoint(int i){
		this.compteurPoint = i;
	}
	
	/*-----METHODS-----*/
	public Point2D getPoint(int i){
		if(i>=0 && i<tabPoints.length)
			return tabPoints[i];
		else
			return null;
	}
	
	public void ajouterPoint(Point2D p){
		if(compteurPoint < tabPoints.length){
			tabPoints[compteurPoint] = p;
			compteurPoint ++;
		}
	}

	public void paintComponent(Graphics2D g) {
		g.create();
		g.setColor(this.getC1());
	}

}
