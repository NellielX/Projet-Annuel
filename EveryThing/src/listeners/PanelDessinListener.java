package listeners;

import java.awt.geom.Point2D;

import modele.Dessin;
import vue.PanelDessin;
import vue.VueDessin;

import com.leapmotion.leap.Controller;
import com.leapmotion.leap.Finger;
import com.leapmotion.leap.FingerList;
import com.leapmotion.leap.Frame;
import com.leapmotion.leap.Gesture;
import com.leapmotion.leap.GestureList;
import com.leapmotion.leap.Listener;
import com.leapmotion.leap.Vector;

public class PanelDessinListener extends Listener{
	//Intercepte les mouvements et propriétés du leap motion
	// exemple onConnect / onFrame
	
	private PanelDessin view;
	private Dessin draw;

    public PanelDessinListener(PanelDessin view, Dessin draw) {
    	this.view = view;
    	this.draw = draw;
    }
    
    public void onConnect(Controller c){
    	System.out.println("Connecté");
    }
    
    public void onDeviceChange(Controller c){
    	
    }
    
    public void onDisconnect(Controller c){
    	System.out.println("Leap Motion déconnecté !");
    }
    
    public void onExit(Controller c){
    	System.out.println("Fermeture");
    }
    
    public void onFocusGained(Controller c){
    	System.out.println("Focus gagné");
    }
    
    public void onFocusLost(Controller c){
    	System.out.println("Focus Perdu");
    }
    /*
    public void onFrame(Controller c){
	    	Frame current = c.frame();
	    	FingerList fingersInFrame = current.fingers();
	  
    		Finger myFinger = fingersInFrame.get(0);
    		Vector FingerDirection = myFinger.direction();
    		
    		Point2D p ;
    		p.setLocation(FingerDirection.getX(), FingerDirection.getY());
    		
    		this.draw.ajouterPoint(p);
    		this.view.revalidate();
    		this.view.repaint();
    }
	*/
	public PanelDessin getView() {
		return view;
	}

	public void setView(PanelDessin view) {
		this.view = view;
	}

	public Dessin getDraw() {
		return draw;
	}

	public void setDraw(Dessin draw) {
		this.draw = draw;
	}
    
    
}
