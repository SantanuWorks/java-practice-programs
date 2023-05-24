// program to check whether a given number five digit is same as its reverse or not
// input through command line
public class CheckRev{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		int n = num, rev = 0 ;
		rev = rev * 10 + num % 10; num /= 10;
		rev = rev * 10 + num % 10; num /= 10;
		rev = rev * 10 + num % 10; num /= 10;
		rev = rev * 10 + num % 10; num /= 10;
		rev = rev * 10 + num % 10;
		if( rev == n ) System.out.print("Number is same with its reverse.");
		else System.out.print("Number is not same with its reverse.");
	}
}