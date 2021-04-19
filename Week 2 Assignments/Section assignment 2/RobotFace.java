package week2;

import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RobotFace extends GraphicsProgram {

	public void run() {
		

		
		  GRect face = new GRect(250,10,200,250); 
		  face.setFilled(true);
		  face.setColor(Color.DARK_GRAY); 
		  face.setFillColor(Color.gray); 
		  add(face);
		  
		  GOval oval1 = new GOval(280,45,35, 35); 
		  oval1.setFilled(true);
		  oval1.setColor(Color.yellow);
		  oval1.setFillColor(Color.YELLOW); 
		  add(oval1);
		  
		  GOval oval2 = new GOval(380,45,35, 35);
		  oval2.setFilled(true);
		  oval2.setColor(Color.yellow);
		  oval2.setFillColor(Color.yellow); 
		  add(oval2);
		  
		  GRect mouth = new GRect(290,170, 120, 50);
		  mouth.setFilled(true);
		  mouth.setColor(Color.white); 
		  mouth.setFillColor(Color.white); 
		  add(mouth);
		  
	}

}
