package Listeners;

import javax.swing.JDialog;

import com.leapmotion.leap.Controller;
import com.leapmotion.leap.Gesture;
import com.leapmotion.leap.GestureList;
import com.leapmotion.leap.Listener;

public class VuePrincipaleListener extends Listener{

    public VuePrincipaleListener() {
    	super();    	
    }
    
    public void onConnect(Controller c){
    	System.out.println("Connecté");
    }
    /*
    public onDeviceChange(Controller arg0)
    public onDisconnect(Controller arg0)
    public onExit(Controller arg0)
    public onFocusGained(Controller arg0)
    public onFocusLost(Controller arg0)
    */
    public void onFrame(Controller c){
    	GestureList listMouvement = c.frame().gestures();
    	for(Gesture g : listMouvement){
    		{
    		    switch (g.type()) {
    		        case TYPE_CIRCLE:
    		            //Handle circle gestures
    		            break;
    		        case TYPE_KEY_TAP:
    		            //Handle key tap gestures
    		        	System.out.println(g.frame().pointable(0));
    		            break;
    		        case TYPE_SCREEN_TAP:
    		            //Handle screen tap gestures
    		            break;
    		        case TYPE_SWIPE:
    		            //Handle swipe gestures
    		            break;
    		        default:
    		            //Handle unrecognized gestures
    		            break;
    		    }
    		}
    	}
    }
    /*
    public onInit(Controller arg0)
    public onServiceConnect(Controller arg0)
    public onServiceDisconnect(Controller arg0)
	*/

}
