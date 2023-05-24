// program to check whether the entered number is even or odd
// input through command line
public class EvenOdd{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		if( num % 2 == 0 ) System.out.print(num+" is a even number!");
		else System.out.print(num+" is a odd number!");
	}
}