package Alphabet;

import java.io.PrintStream;

class Alphabet {

    // Name       : W.J.R. Budding
    // Assignment : Alphabet
    // Date       : 13-09-2016
	// voorkeur for loop gebruiken
	
	PrintStream out;
	
	Alphabet(){
		out = new PrintStream(System.out);
	}
	
	void start(){
		String aletter = "a";

		
		for(int nletter=1; nletter<26; nletter++){
			aletter =String.valueOf( (char) (nletter+64));
			out.print(aletter);
			if(nletter<25){
				out.print(", ");
			};

		} ;
		out.println("\nDone!");
		
		
	}
	
	
	public static void main(String[] args) {
		new Alphabet().start();

	}

}
