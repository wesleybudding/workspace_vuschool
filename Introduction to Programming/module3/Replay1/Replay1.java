package Replay1;

import ui.OthelloReplayUserInterface;
import ui.UserInterfaceFactory;
import java.util.Scanner;
import java.io.PrintStream;
import ui.UIAuxiliaryMethods;

class Replay1 { 
    // Name       : W.J.R. Budding
    // Assignment : Replay1
    // Date       : 2016-09-25
	//functions	  : ui.WHITE/BLACK, ui.NUMBER_OF_COLLUMS/ROWS, ui.ShowChanges, ui.wait
	// questions  : How to import file, entering or just reading
	
	PrintStream out;
	OthelloReplayUserInterface ui;

	Replay1(){
		out = new PrintStream(System.out);
		ui = UserInterfaceFactory.getOthelloReplayUI();
		
	}
	int charToNmbr(char letter){
		int nr;
		int pos = letter - 'a' ;
		return pos;
	}
	int blackWhite(String col){
		int c;
		if (col.equals("white")){
			c=1;
		}else{
			c=2;
		}
		return c;
	}
	
	String[] splitString(String line){
		String[] splay = line.split("\\s+");
		return splay;
	}
	
	void play(String splay[]){
		if (splay[2].equals("move")){
			ui.wait(Integer.parseInt(splay[1]));
			int player = blackWhite(splay[0]);
			ui.place((charToNmbr(splay[3].charAt(0))) ,Integer.parseInt(splay[4])-1, player);
			}
	}
	
	
	void start(){		
		String 	sw1="white 0 move d 4", 
				sw2="white 0 move e 5", 
				sb1="black 0 move d 5", 
				sb2="black 0 move e 4";
		play(splitString(sw1));
		play(splitString(sw2));
		play(splitString(sb1));
		play(splitString(sb2));
		ui.showChanges();
		

		Scanner in = UIAuxiliaryMethods.askUserForInput().getScanner();
		String line = in.nextLine();
		out.println(line);
        while (in.hasNextLine()){
        	line = in.nextLine();
        	out.println(line);
			String splay[]= splitString(line);
			play(splay);
			ui.showChanges();
			

		}
		out.println("done");


	}

	public static void main(String[] args) {	
		new Replay1().start();
	}

}
