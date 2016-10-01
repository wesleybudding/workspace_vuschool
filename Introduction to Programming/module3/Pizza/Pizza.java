package Pizza;

import java.io.PrintStream;
import java.util.Scanner;

class Pizza {
    // Name       : W.J.R. Budding
    // Assignment : Pizza
    // Date       : 2016-09-20
	
	PrintStream out;
	
	Pizza(){ 
		out = new PrintStream(System.out);
	}
	
	int fctn(int fctn){
		int a=1;
		for(int c =1 ; c <=fctn; c++)
			a = a*c;

		return a;
	}
	
	int Pblty(int ingr, int top){
		int fing, ftop, fit, Pblty;

		// calculate possibilities N!/K!*(N-K)! figure out how to calculate this.
		fing=fctn(ingr);
		ftop=fctn(top);
		fit=fctn(ingr-top);
		Pblty=fing/(ftop*fit);
		return Pblty;
		
		//http://math.stackexchange.com/questions/35174/how-calculate-the-number-of-possible-different-variations
		
	}
	
	void start(){ 
	    Scanner in = new Scanner(System.in);
		int mario_in=10, mario_top=3, luigi_in=9, luigi_top=4, mariop, luigip;
		mariop = Pblty(mario_in,mario_top);
		out.println("variety mario: "+ mariop);
		out.println();
		luigip = Pblty(luigi_in,luigi_top);
		out.println("variety luigi: "+ luigip);
		out.println("Calculate your own y/n?: ");
		String confirm = in.nextLine();
		if (confirm.equals("y")){ 
			out.println("how manny toppings: ");
			int top = in.nextInt();
			out.println("how manny ingredients: ");
			int ing = in.nextInt();
			int yourp = Pblty(ing, top);
			out.println("your variety : "+ yourp);
		}else{ out.println("thank you!");};
		

	}

	public static void main(String[] args) {
		new Pizza().start();

	}

}
