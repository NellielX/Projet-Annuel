package test2_myExamples;

import javax.swing.JFrame;

import com.leapmotion.leap.Controller;

public class ViewLeap extends JFrame{
	
	private MyListener myListener ;
	private java.util.Vector tab;
	
	public ViewLeap(){
		this.setTitle("Test Leap 1 - Deplacer un point avec le leap motion");
		this.setSize(640,480);
		this.setVisible(true);
		
	}
	
	public void setPosition(Doigt d){
		tab.add(d);
	}

}
