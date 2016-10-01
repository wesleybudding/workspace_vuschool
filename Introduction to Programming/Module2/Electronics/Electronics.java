package Electronics;

import java.io.PrintStream;
import java.util.Scanner;

class Electronics {

    // Name       : W.J.R. Budding
    // Assignment : Electronics
    // Date       : 13-09-2016
	
	PrintStream out;
	
	Electronics(){
		out = new PrintStream(System.out);
	}
	
	void start(){
		double discount=0, total, perc=0.15;
		Scanner in = new Scanner(System.in);
		
		out.printf("Enter the price of the first article: ");
		double first = in.nextDouble();
		out.printf("Enter the price of the second article: ");
		double second = in.nextDouble();
		out.printf("Enter the price of the third article: ");
		double third = in.nextDouble();
		
		if (first >= second && first >= third){ 
		discount = first*perc;
	}	else if(second >= third){
			discount = second*perc;
		} else {
			discount = third*perc;
		}
		discount = (int) (discount*100+0.5);
		discount = discount/100.00;
		out.println("Discount: " + discount);
		total = first+second+third-discount;
		out.println("Total: " +(first+second+third-discount));
	}	
	
	
	public static void main(String[] args) {
			new Electronics().start();

	}

}
