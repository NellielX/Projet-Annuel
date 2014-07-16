package listeners;

import modele.Dessin;
import modele.Point;
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
	//Intercepte les mouvements et propri�t�s du leap motion
	// exemple onConnect / onFrame
	
	private PanelDessin view;
	private Dessin draw;

    public PanelDessinListener(PanelDessin view, Dessin draw) {
    	this.view = view;
    	this.draw = draw;
    }
    
    public void onConnect(Controller c){
    	System.out.println("Connect�");
    }
    
    public void onDeviceChange(Controller c){
    	
    }
    
    public void onDisconnect(Controller c){
    	System.out.println("Leap Motion d�connect� !");
    }
    
    public void onExit(Controller c){
    	System.out.println("Fermeture");
    }
    
    public void onFocusGained(Controller c){
    	System.out.println("Focus gagn�");
    }
    
    public void onFocusLost(Controller c){
    	System.out.println("Focus Perdu");
    }

    public void onFrame(Controller c){
    	Frame current = c.frame();
    	FingerList fingersInFrame = current.fingers();
    	if(fingersInFrame.count()==1){
    		Finger myFinger = fingersInFrame.get(0);
    		Vector FingerDirection = myFinger.direction();
    		
    		Point p = new Point(FingerDirection.getX(),FingerDirection.getY());
    		this.draw.ajouterPoint(p);
    		this.view.repaint();
    	}
    }
    
    
}
