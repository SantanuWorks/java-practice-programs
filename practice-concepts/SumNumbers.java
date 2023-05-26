// program to demonstrate the do while loop 
// asks the user a and b through command line
// adds all numbers between a to b ( inclusive n a < b )
public class SumNumbers{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = 0 ;
		int i = a ;
		do{
			sum += i ;
			i++;
		}
		while( i <= b );
		System.out.println("Sum of numbers between "+a+" and "+b+" is "+sum);
	}
}