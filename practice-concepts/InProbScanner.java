// program to demonstrate and fix input problem of scanner class 
import java.util.Scanner;
public class InProbScanner{
	public static void main(String args[]){
		// create an object of Scanner class
		// by passing std input stream object System.input
		Scanner sc = new Scanner(System.in);
		String name ;
		byte id ;
		id = sc.nextByte(); // read int type
		name = sc.nextLine(); // read string // input will be skipped
		System.out.println("name: "+name+" , id = "+id); // blank output
		// fixing problem: use an extra nextLine() between nextXYZ() and nextLine()
		id = sc.nextByte(); // read int type
		sc.nextLine(); // this will read the newline ignored by nextXYZ(); and fix the problem
		name = sc.nextLine(); // now it can read input without skipping
		System.out.println("name: "+name+" , id = "+id); // correct output
	}
}