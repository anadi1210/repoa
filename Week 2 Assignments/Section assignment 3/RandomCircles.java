package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {

	
	private static final int TOTAL = 10;

	private static final double MINIMUM_RADIUS = 5;
	
	private static final double MAXIMUM_RADIUS = 50;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		for (int i = 1; i <= TOTAL; i++) {
			double r = rgen.nextDouble(MINIMUM_RADIUS, MAXIMUM_RADIUS); // this will give a random value for radius between 5 and 50
			double x = rgen.nextDouble(0, getWidth() - 2 * r);  // this will give random value for x coordinate between 0 and difference of total width and diameter of circle
			double y = rgen.nextDouble(0, getHeight() - 2 * r); // this will give random value for y coordinate between 0 and difference of total height and diameter of circle
			GOval circle = new GOval(x, y, 2 * r, 2 * r); // height and width = 2*r which is equal to the diameter of circle
			circle.setFilled(true);
			circle.setColor(rgen.nextColor());
			add(circle);
		}
	}
} 

