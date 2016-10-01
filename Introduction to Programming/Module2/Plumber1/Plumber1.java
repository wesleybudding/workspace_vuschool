package Plumber1;

import java.io.PrintStream;
import java.util.Scanner;

class Plumber1 {
    // Name       : W.J.R. Budding
    // Assignment : Plumber1
    // Date       : 13-09-2016
	
	PrintStream out;
	
	Plumber1(){
		out = new PrintStream(System.out);
	}

	void start(){
		Scanner in = new Scanner(System.in);
		
		out.printf("Enter the hourly wages: ");
		double pperhour = in.nextDouble();
		out.printf("Enter the number of billable hours: ");
		double hours = in.nextDouble();	
		double total = pperhour*hours;
		out.println("The total cost of this repair is: " + total);
	}

	

	public static void main(String[] args) {
		new Plumber1().start();

	}

}
