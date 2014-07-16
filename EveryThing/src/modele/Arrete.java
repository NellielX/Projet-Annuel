package modele;

public class Arrete {
	
	private Point[] tabPoint;
	
	public Arrete( Point p1, Point p2){
		this.tabPoint = new Point[2];
		tabPoint[0] = p1;
		tabPoint[1] = p2;
	}
	
	public Point[] getTabPoint() {
		return tabPoint;
	}

	public void setTabPoint(Point[] tabPoint) {
		this.tabPoint = tabPoint;
	}

}
