// find the factorial of a given number 
// input the number through the command line
public class Factorial{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		long fact = 1 ;
		if( num != 0 ) for( int i = num ; i > 1 ; i-- ) fact *= i ;
		System.out.print("Factorial of "+num+" is "+fact);
	}
}