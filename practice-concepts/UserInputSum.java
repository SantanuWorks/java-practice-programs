// program to demonstrate the while loop
// find the sum of numbers betweeen a and b inclusive; a <= b, a,b are positive
// user input program
// input through command line accepted
public class UserInputSum{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = 0 ;
		int i = a ;
		// calculate sum of 1 to 10
		while( i <= b ){
			sum += i ;
			i ++ ;
		}
		System.out.print("Sum of one to ten is "+sum);
	}
}