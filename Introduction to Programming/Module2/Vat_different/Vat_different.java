package Vat_different;
import java.util.Scanner;
public class Vat_different {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double incvat, exvat;
		
		System.out.print("Enter the price of an article including VAT: ");
		incvat = keyboard.nextDouble();
		exvat = Math.round(incvat/1.21*100);
		System.out.print("This article will cost " + exvat/100 +  " euro without 21.00% VAT.");

	}

}
