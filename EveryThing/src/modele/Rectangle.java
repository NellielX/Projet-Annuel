package modele;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Forme{
	
	private Color couleurTrait ;
	private Color couleurFond ;
	
	public Rectangle(Point2D[] tabPoints, Color ct, Color cf){
		setTabPoints(tabPoints);
		setCouleurTrait(ct);
		setCouleurFond(cf);
	}

	public Rectangle() {
		setTabPoints(new Point2D[4]);
	}

	public Color getCouleurFond() {
		return couleurFond;
	}

	public void setCouleurFond(Color couleurFond) {
		this.couleurFond = couleurFond;
	}

	public Color getCouleurTrait() {
		return couleurTrait;
	}

	public void setCouleurTrait(Color couleurTrait) {
		this.couleurTrait = couleurTrait;
	}

	@Override
	public boolean contains(Point2D p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Rectangle2D r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(double x, double y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(double x, double y, double w, double h) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public java.awt.Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform at) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean intersects(Rectangle2D r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean intersects(double x, double y, double w, double h) {
		// TODO Auto-generated method stub
		return false;
	}

}
