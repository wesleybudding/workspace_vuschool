package Collatz;

import java.io.PrintStream;
import java.util.Scanner;

public class Collatz {
    // Name       : W.J.R. Budding
    // Assignment : Collatz
    // Date       : 13-09-2016
	
	PrintStream out;
	
	Collatz(){
		out = new PrintStream(System.out);
	}
	
	void start(){
		Scanner in = new Scanner(System.in);
		
		out.println("Enter a number to calculate the Collatz sequence: ");
		int nmbr = in.nextInt();
		
		do {
			if(nmbr%2 == 0){
				
				out.print(nmbr+", ");
				nmbr = nmbr/2;
			} else {
				
				out.print(nmbr+", ");
				nmbr=3*nmbr+1;
			} 
		} while(nmbr!=1);
		out.print(nmbr);

		
	}
	
	
	public static void main(String[] args) {
		new Collatz().start();

	}

}
