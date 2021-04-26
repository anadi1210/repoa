package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {

	public void run() {
			while (true) {
				String digits = readLine("Enter a numeric string: ");
				if (digits.length() == 0) break;
				println(addCommasToNumericString(digits));
			}
		}

	private String addCommasToNumericString(String digits) {
		String str = "";
		int counter = 1;
		int length = digits.length();
		
		for(int i = (length-1); i>=0; i--) {
			str = digits.charAt(i) + str;
			if((counter % 3) == 0 && i> 0) {
				str = "," + str;
			}
			counter++;
		}
		return str;
	}
	

}
