package modele;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Ligne extends Forme{
	
	private Color couleurTrait;
	
	/* --- CONSTRUCTORS --- */
	public Ligne(){
		init(new Point2D[2]);
		couleurTrait = Color.BLACK ;
	}
	
	public Ligne(Point2D[] listPoint, Color ct){
		couleurTrait = ct;
		setTabPoints(listPoint);
	}

	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		double width = Math.abs(getX2()-getX1());
		double height = Math.abs(getY2()-getY1());
		Rectangle2D r = null ;
		r.setRect(getPoint(0).getX(), getPoint(0).getY(), width, height);
		return r;
	}
	
	/* --- GETTERS AND SETTERS --- */
	public Color getCouleurTrait() {
		return couleurTrait;
	}

	public void setCouleurTrait(Color couleurTrait) {
		this.couleurTrait = couleurTrait;
	}

	/* --- METHODS --- */
	public Point2D getP1() {
		return getPoint(0);
	}

	public Point2D getP2() {
		return getPoint(1);
	}
	
	public double getX1() {
		return getPoint(0).getX();
	}

	public double getX2() {
		return getPoint(1).getX();
	}
	
	public double getY1() {
		return getPoint(0).getY();
	}

	public double getY2() {
		return getPoint(1).getY();
	}

	public void setLine(double x1, double x2, double y1, double y2) {
		getPoint(0).setLocation(x1, y1);
		getPoint(1).setLocation(x2, y2);
	}

	@Override
	public boolean contains(Point2D arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Rectangle2D arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(double arg0, double arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(double arg0, double arg1, double arg2, double arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform arg0, double arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean intersects(Rectangle2D arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean intersects(double arg0, double arg1, double arg2, double arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void paintComponent(Graphics2D g) {
		// TODO Auto-generated method stub
		g.drawLine((int)getPoint(0).getX(), (int)getPoint(0).getY(), (int)getPoint(1).getX(), (int)getPoint(1).getY());
	}

}
