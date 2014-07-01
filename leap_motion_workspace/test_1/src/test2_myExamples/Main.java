package test2_myExamples;

import java.io.IOException;

import com.leapmotion.leap.Controller;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyListener ecouteur = new MyListener();
		Controller cont = new Controller();
		ViewLeap myView = new ViewLeap();
		
		cont.addListener(ecouteur);
		
		
		// Keep this process running until Enter is pressed
        System.out.println("Press Enter to quit...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Remove the sample listener when done
        cont.removeListener(ecouteur);
	}

}
