package Manny;

import java.io.PrintStream;
import java.util.Scanner;

class Manny {
    // Name       : W.J.R. Budding
    // Assignment : Manny
    // Date       : 13-09-2016
	// gebruik constante 
	
	PrintStream out;
	
	Manny(){
		out = new PrintStream(System.out);
	}
	
	void start(){
		double amount=0.00, enough=50;
		Scanner in = new Scanner(System.in);
	do{ 
		out.printf("Enter the amount you want to donate: ");
		amount = in.nextDouble();
	} while(amount < enough);
	
		out.println("Thank you very much for your contribution of " + amount + " euro (\u20AC).");
	
	
		
	}

	public static void main(String[] args) {
		new Manny().start();

	}

}
