package HelloWorld2;

import java.io.PrintStream;
import java.util.Scanner;

class HelloWorld2 {
    // Name       : W.J.R. Budding
    // Assignment : HelloWorld2
    // Date       : 12-09-2016
    PrintStream out;
    
    HelloWorld2() {
        out = new PrintStream(System.out);
}
    
    void start() {
	    Scanner in = new Scanner(System.in);
	        
	    out.printf("Enter your name: ");
	    String name = in.nextLine();
	    
	    out.printf("Hello world!! ");
	    out.printf("written by: %s\n", name); //would expect an enter in eclipse ?!
}
    
    
    
    public static void main(String[] argv) {
        new HelloWorld2().start();

} }