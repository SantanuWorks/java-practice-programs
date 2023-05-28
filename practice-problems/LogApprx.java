// The natural logarithm can be approximated by the following series.
// x-1/x + 1/2(x-1/x)^2+ 1/2(x-1/x)^3 + ...
// if x us input through the keyboard, write a program to calculate the sum of first seven terms of this series.
// input through command line
public class LogApprx{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		double rep = (x-1.0)/x ;
		double log = rep ;
		double term ;
		for( int i = 2 ; i < 8 ; i++ ){
			term = 0.5 * Math.pow(rep,i);
			log += term ;
		}
		System.out.print("Natural log value is "+log);
	}
}