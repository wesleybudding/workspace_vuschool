package SecondSmallest;

import java.io.PrintStream;

public class SecondSmallest {

    // Name       : W.J.R. Budding
    // Assignment : SecondSmallest
    // Date       : 13-09-2016
	
	PrintStream out;
	
	SecondSmallest(){
		out = new PrintStream(System.out);
	}
	
	void start(){
		int a,b,c,d,e,smallest,second;
		a = 1 + (int)(100*Math.random());
		b = 1 + (int)(100*Math.random());
		c = 1 + (int)(100*Math.random());
		d = 1 + (int)(100*Math.random());
		e = 1 + (int)(100*Math.random());
		out.println(a+","+b+","+c+","+d+","+e);
		
		if(a<b){
			smallest=a;
			second=b;
		} else {
			smallest=b;
			second=a;
		}
		if (c<second && c>smallest){
			second=c;

		} else if(c<second && c<smallest){
			second=smallest;
			smallest=c;
		} else{
		}	
		
		if (d<second && d>smallest){
			second=d;
		} else if(d<second && d<smallest){
			second=smallest;
			smallest=d;
		} else{
		}
		
		
		if (e<second && e>smallest){
			second=e;

		} else if(e<second && e<smallest ){
			second=smallest;
			smallest=e;
		} else{

		}
		out.println("second largest: "+ second);
	}
	
	public static void main(String[] args) {
		new SecondSmallest().start();
	}

}
