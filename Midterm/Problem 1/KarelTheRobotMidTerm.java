package test;

/* File: KarelTheRobotMidTerm.java */
import stanford.karel.*;
public class KarelTheRobotMidTerm extends SuperKarel {
	public void run() {
		setBeepersInBag(100);
		moveUpRow();
		for(int i = 0; i < 4; i++) {
			
			handleBorder();
			nextPosition();
		}
	}

	private void handleBorder() {
		move();
		while (frontIsClear()) {
		
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}

	private void moveUpRow() {
		turnLeft();
		move();
		turnRight();
	}

	private void nextPosition() {
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
	}
}