package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {

	public void run() {
		while (true) {
			String str = readLine("Enter a string: ");
			String ch = readLine("Enter the character to be removed : ");
			char c = ch.charAt(0);
			//char[] c = ch.toCharArray();

			if(str.length() == 0) break;

			//
			println( removeAllOccurrences(str, c));
		}
	}


	private String removeAllOccurrences(String str, char c) { 
		String resultStr  = ""; 
		for(int i = 0; i <str.length() ; i++) {
			if(str.charAt(i) != c) {
				resultStr = resultStr + str.charAt(i); 
			}
		}
		return resultStr; 
	}
}
