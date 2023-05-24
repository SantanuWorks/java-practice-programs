// program to find the absolute value of a number entered
// input through command line
public class Absolute{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int ab;
		ab = n;
		if( n < 0 ) ab = -n ;
		System.out.print("| "+n+" |"+" = "+ab);
	}
}