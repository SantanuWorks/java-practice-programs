// program to find the sum of digits of a 5 digit number
// input through the command line
public class SumDigits{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int sum = 0 ;
		int n = num ;
		sum = sum + num % 10 ; num /= 10 ;
		sum = sum + num % 10 ; num /= 10 ;
		sum = sum + num % 10 ; num /= 10 ;
		sum = sum + num % 10 ; num /= 10 ;
		sum = sum + num % 10 ;
		System.out.print("Sum of digits of "+n+" is "+sum);
	}
}