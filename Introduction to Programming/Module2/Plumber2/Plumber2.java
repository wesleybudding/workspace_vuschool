package Plumber2;

import java.io.PrintStream;
import java.util.Scanner;

class Plumber2 {
    // Name       : W.J.R. Budding
    // Assignment : Plumber2
    // Date       : 13-09-2016
	
	PrintStream out;
	
	Plumber2(){
		out = new PrintStream(System.out);
	}

	void start(){
		Scanner in = new Scanner(System.in);
		
		out.printf("Enter the hourly wages: ");
		double pperhour = in.nextDouble();
		out.printf("Enter the number of billable hours: ");
		double hours = in.nextDouble();	
		int rhours = (int) (hours+0.5);
		double total = pperhour*rhours*1.00;

		out.println("The total cost of this repair is: " + total);
	}

	

	public static void main(String[] args) {
		new Plumber2().start();

	}

}
