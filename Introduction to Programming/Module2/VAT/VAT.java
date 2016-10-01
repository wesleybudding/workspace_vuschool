package VAT;

import java.io.PrintStream;
import java.util.Scanner;

class VAT {
    // Name       : W.J.R. Budding
    // Assignment : VAT
    // Date       : 13-09-2016
	
	PrintStream out;
	
	VAT() {
		out = new PrintStream(System.out);
	}
	
	void start(){
		Scanner in = new Scanner(System.in);
		
		out.printf("Enter the price of an article including VAT: ");
		double incvat = in.nextDouble();
		double exvat = (Math.round(incvat/1.21*100))/100.00;
		out.println("This article will cost "+ exvat + " euro without 21.00% VAT.");
		
	}
	
	
	public static void main(String[] args) {
		new VAT().start();

	}

}
