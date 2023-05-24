// program to reverse a 5 digit number
// input through the command line
public class RevNum{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int rev = 0 ;
		rev = rev * 10 + num % 10 ; num /= 10 ;
		rev = rev * 10 + num % 10 ; num /= 10 ;
		rev = rev * 10 + num % 10 ; num /= 10 ;
		rev = rev * 10 + num % 10 ; num /= 10 ;
		rev = rev * 10 + num % 10 ;
		System.out.print("Reverse of "+num+" is "+rev);
	}
}