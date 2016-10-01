package Othello1;

import java.io.PrintStream;
import java.util.Scanner;

class Othello1 {
	
    // Name       : W.J.R. Budding
    // Assignment : Othello1
    // Date       : 13-09-2016
	// gebruik constante 
	
	PrintStream out;
	
	Othello1(){
		out = new PrintStream(System.out);
	}
	
	void start(){
		double perc=0.64;
		Scanner in = new Scanner(System.in);
		
		out.printf("Enter the number of white pieces on the board: ");
		int white = in.nextInt();
		out.printf("Enter the number of black pieces on the board: ");
		int black = in.nextInt();
		double perc_b_o_board = (black/perc);
		out.println("The percentage of black pieces on the board is: " + perc_b_o_board + "%");
		double perc_b_o_stones = (black/((black+white)/100.00));
		out.println("The percentage of black pieces of all the pieces on the board is: " + perc_b_o_stones + "%");
		
	}
	

	public static void main(String[] args) {
		new Othello1().start();

	}

}
