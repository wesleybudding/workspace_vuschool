package Othello2;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Othello2 {
	
    // Name       : W.J.R. Budding
    // Assignment : Othello2
    // Date       : 13-09-2016
	// %02d om af te ronden
	
	PrintStream out;
	
	Othello2(){
		out = new PrintStream(System.out);
	}
	
	void start(){
		Scanner in = new Scanner(System.in);
		
		out.printf("Enter the time the black player thought: ");
		int white = in.nextInt();
		out.printf("Enter the time the white player thought: ");
		int black = in.nextInt();
		
		if (white == black){
			out.println("i can't decide wich player is the human!");
		} else if(white >= black){
			
			String hms = String.format("%02d:%02d:%02d", TimeUnit.SECONDS.toHours(white),
					TimeUnit.SECONDS.toMinutes(white) % TimeUnit.HOURS.toMinutes(1),
				    TimeUnit.SECONDS.toSeconds(white) % TimeUnit.MINUTES.toSeconds(1));
			out.println("The time the human (white) player has spent thinking is: " + hms );
		} else{
			String hms = String.format("%02d:%02d:%02d", TimeUnit.SECONDS.toHours(black),
					TimeUnit.SECONDS.toMinutes(black) % TimeUnit.HOURS.toMinutes(1),
				    TimeUnit.SECONDS.toSeconds(black) % TimeUnit.MINUTES.toSeconds(1));
			out.println("The time the human (black) player has spent thinking is: " + hms );
		}
		
		

	}
	

	public static void main(String[] args) {
		new Othello2().start();

	}

}
