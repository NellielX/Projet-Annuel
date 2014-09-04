package modele;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Dessin2  extends JPanel implements MouseListener{
	int X;
	int Y;
	public ArrayList<Point> tabCoordonnees;
	public ArrayList<Color> tabCouleurT;
	public Color couleurActuelle;
	public Graphics g = this.getGraphics();
	
	public Dessin2() {
//	    setBackground(Color.WHITE);
		tabCoordonnees = new ArrayList<Point>();
		tabCouleurT = new ArrayList<Color>();
	}
	 
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    for(int i=0;i<tabCoordonnees.size(); i+=2){
	    	g.setColor(tabCouleurT.get(i/2));
	    	g.drawLine(tabCoordonnees.get(i).getX(), tabCoordonnees.get(i).getY(), tabCoordonnees.get(i+1).getX(), tabCoordonnees.get(i+1).getY());
	    }
	}

	public void mouseClicked(MouseEvent arg0) {
		
		Graphics g = this.getGraphics();
		changerCouleurTrait(g, "noir");
		tabCoordonnees.add( new Point(arg0.getX(), arg0.getY()) );
		if (tabCoordonnees.size() %2== 0){
			tabCouleurT.add(couleurActuelle);
		}
		paintComponent(g);
		
//		g.drawLine(tabCoordonnees[0].getX(), tabCoordonnees[0].getY(), tabCoordonnees[1].getX(), tabCoordonnees[1].getY());

		
			
	}

	public void dessinerUneLigneAvecCoordonnées(int x, int y){
		Graphics g = this.getGraphics();
		super.paintComponent(g);
		g.drawLine(x, y, x, y); 
	}
	
	public void effacerDessin(){
		setBackground(Color.GRAY);
		setBackground(Color.WHITE);
	}
	
	public void changerCouleurPanneau(String uneCouleur) {
		switch (uneCouleur) {
		case "rouge":
			setBackground(Color.RED);
			break;
		case "vert":
			setBackground(Color.GREEN);
			break;
		case "bleu":
			setBackground(Color.CYAN);
			break;
		case "blanc":
			setBackground(Color.WHITE);
			break;
		default:
			break;
		}
		
	}
	
	public void changerCouleurTrait(Graphics g, String uneCouleur){
		switch (uneCouleur) {
		case "rouge":
			g.setColor(Color.RED);
			break;
		case "vert":
			g.setColor(Color.GREEN);
			break;
		case "bleu":
			g.setColor(Color.BLUE);
			break;
		case "noir":
			g.setColor(Color.BLACK);
			break;
		default:
			g.setColor(Color.BLACK);
			break;
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
	
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
