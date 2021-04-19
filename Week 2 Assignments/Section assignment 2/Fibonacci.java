package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 10000;
	int term = 0;
	int num0 = 0, num1 = 1;
	public void run() {
		println(num0);
		println(num1);
		//if(term < MAX_TERM_VALUE) {
			while(term < MAX_TERM_VALUE) {
				calculateFibonacci();
			}
		//}
	}
	private void calculateFibonacci() {
		term = num0 + num1;
		num0 = num1;
		num1 = term;	
		if(term < MAX_TERM_VALUE)
			println(term);
	}
}
