package modele;

import java.awt.Graphics2D;
import java.awt.Shape;

public abstract class Forme implements Shape{
	
	private int id;

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public abstract void paintComponent(Graphics2D g);

}
