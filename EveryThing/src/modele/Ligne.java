package modele;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Ligne extends Forme{
	
	private Point2D p1;
	private Point2D p2;
	private Color couleurTrait;

	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		double width = Math.abs(getX2()-getX1());
		double height = Math.abs(getY2()-getY1());
		Rectangle2D r = null ;
		r.setRect(p1.getX(), p2.getY(), width, height);
		return r;
	}

	public Point2D getP1() {
		return p1;
	}

	public Point2D getP2() {
		return p2;
	}
	
	public double getX1() {
		return p1.getX();
	}

	public double getX2() {
		return p2.getX();
	}
	
	public double getY1() {
		return p1.getY();
	}

	public double getY2() {
		return p2.getY();
	}

	public void setLine(double x1, double x2, double y1, double y2) {
		p1.setLocation(x1, y1);
		p2.setLocation(x2, y2);
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
		g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());
	}

}
