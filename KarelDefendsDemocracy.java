package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	int position = 1;
	public void run() {
		while(frontIsClear()) {
			if(position%2 == 0) {
				if(beepersPresent()) {
					move();				
				}
				else {
					checkAbove();
					checkBelow();
					move();	
				}	
			}
			else {
				move();	
			}
			position++;	
		}		
	}
	private void checkAbove() {
		turnLeft();
		move();
		collectBeeper();
		turnAround();
		move();
		turnLeft();
	}
	private void checkBelow() {
		turnRight();
		move();
		collectBeeper();
		turnAround();
		move();
		turnRight();	
	}		
	private void collectBeeper() {
		if(beepersPresent()) {
			while(beepersPresent())
				pickBeeper();
		}
	}
}
