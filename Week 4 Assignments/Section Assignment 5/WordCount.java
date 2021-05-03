package week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

public class WordCount extends ConsoleProgram {

	public void run() {
		String fileName = "lear.txt";
		int lines = 0;
		int words = 0;
		
		int charCount=0;
		
		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while(true) {
				String line = rd.readLine();
				if(line == null) break;	
				
				charCount += line.length();
				lines++;
				String[] wordCount = line.split(" ");
				words += wordCount.length;

				for(int i = 0; i<wordCount.length; i++) {
					if(wordCount[i].contains("'")) {
						words += 1;
					}
				}	

				println("File = " +fileName);
				println("Lines = " + lines);
				println("Words = " +  words);
				
				println("Char Count = " + charCount);
				rd.close();
			}
		}
		catch(IOException ex) {
			throw new ErrorException(ex);
		}


	}
}
