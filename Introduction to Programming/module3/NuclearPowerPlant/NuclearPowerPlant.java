package NuclearPowerPlant; 

import java.io.PrintStream;

class NuclearPowerPlant { 
    // Name       : W.J.R. Budding
    // Assignment : NuclearPowerPlant
    // Date       : 2016-09-18
	
	PrintStream out;
	
	NuclearPowerPlant(){ 
		out = new PrintStream(System.out);
	}
	
	void start(){
		int count=0;
		
		do {
			out.print("NUCLEAR CORE UNSTABLE!!!!\nQuarantine is in effect.\nSurrounding hamlets will be evacuated.\nAnti-radiationsuits and iodine pills are mandetory.\n\n");
			count++;
		} while (count<3);
	}

	public static void main(String[] args) {
		new NuclearPowerPlant().start();

	}

}
