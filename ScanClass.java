// program to use scanner class for input
import java.util.Scanner;
public class ScanClass{
	public static void main(String args[]){
		// create an object of Scanner class
		// by passing std input stream object System.input
		Scanner sc = new Scanner(System.in);
		String name ;
		byte age ;
		char grade ;
		short mark ;
		float percent ;
		System.out.print("Enter your name: ");
		name = sc.nextLine(); // read string
		System.out.print("Enter your age: ");
		age = sc.nextByte(); // read int type
		System.out.print("Enter your grade: ");
		grade = sc.next().charAt(0); // read a char at 0 index
		System.out.print("Enter your mark: ");
		mark = sc.nextShort(); // read an int type
		System.out.print("Enter your percent: ");
		percent = sc.nextFloat(); // read floating point value
		
		System.out.println("Student name: "+name);
		System.out.println("age: "+age);
		System.out.println("grade: "+grade);
		System.out.println("mark: "+mark);
		System.out.print("percent: "+percent);
	}
}