package RepeatCharacter2;

import java.io.PrintStream;
import java.util.Scanner;


class RepeatCharacter2 {

    // Name       : W.J.R. Budding
    // Assignment : RepeatCharacter2
    // Date       : 2016-09-19
	// code moet samengevoegd worden opgeven of er komma/letter/etc wordt meegegeven.
	
	PrintStream out;
	
	RepeatCharacter2(){
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
		out.print("Enter how much \"!\" you want to see: ");
		int enter = read();
		do{
			out.print("!");
			count++;
		}while (count<enter);
		
		out.print("\n now how many \",\" you want to see: ");
		enter = read();
		count=0;
		do{
			out.print(",");
			count++;
		}while (count<enter);
		
	}

	public static void main(String[] args) {
		new RepeatCharacter2().start();

	}

}
