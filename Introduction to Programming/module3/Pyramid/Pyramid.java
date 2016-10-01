package Pyramid; 

import java.io.PrintStream;
import java.util.Scanner;


class Pyramid {
    // Name       : W.J.R. Budding
    // Assignment : Pyramid
    // Date       : 19-09-2016
	// note to myself try to do this with spacing and while statements
	// check ordinal function
	// methodes toepassen.
	PrintStream out;
	
	Pyramid(){
		out = new PrintStream(System.out);
	}
	
	void printlines(int lines){

		int start =0;
		int linedown=lines;
		int lettercount=1;
		int lineup=1;
		int spacesl=(51-lettercount)/2;
		int spacesr=(51-lettercount)/2;
		String letter = "A"; 
		
		
		while (linedown>0){
			
			do{
				out.print(" ");
				spacesl--;
			} while (spacesl>0);
			
			while (start<lettercount){
				out.print(letter);
				start++;
			};
			
			do{
				out.print(" ");
				spacesr--;
			} while (spacesr>0);
			
			
			linedown--;
			lineup++;
			out.println();
			lettercount=lettercount+2;
			spacesl=(51-lettercount)/2;
			spacesr=(51-lettercount)/2;
			start=0;
			int charValue = letter.charAt(0);
			letter = String.valueOf( (char) (charValue + 1));
			
		};

		
	}
	
	
	void start(){ 
	    Scanner in = new Scanner(System.in);
		out.print("how many lines: \n");
		int lines = in.nextInt();
		
		if (lines<27){
			printlines(lines);	
		} else {
			out.println("thats to much");
		}


		
	}

	public static void main(String[] args) {
		new Pyramid().start();

	}

}
