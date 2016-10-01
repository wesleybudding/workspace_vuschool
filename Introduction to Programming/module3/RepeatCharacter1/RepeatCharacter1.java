package RepeatCharacter1;

import java.io.PrintStream;
import java.util.Scanner;


class RepeatCharacter1 {

    // Name       : W.J.R. Budding
    // Assignment : RepeatCharacter1
    // Date       : 2016-09-19
	
	PrintStream out;
	
	RepeatCharacter1(){
		out = new PrintStream(System.out);
		
	}
	int read(){
	    Scanner in = new Scanner(System.in);
		int nummer;
		nummer = in.nextInt();
		return nummer;
	}
	
	
	void start(){ 
		int count =0;
		out.print("Enter how much ! you want to see: ");
		int enter = read();
		do{
			out.print("!");
			count++;
		}while (count<enter);
		
	}

	public static void main(String[] args) {
		new RepeatCharacter1().start();

	}

}
