// Write a program to search a number in an array of 25 elements and display the number of times 
// it appeared.
import java.util.Scanner;
public class Array2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[25];
		int key;
		byte c = 0;
		System.out.print("Enter 25 numbers: ");
		for(int i = 0; i < 25; i++) arr[i] = sc.nextInt();
		System.out.print("Enter key to search: ");
		key = sc.nextInt();
		
		for(int i = 0; i < 25; i++) if( arr[i] == key ) c++;
		
		if( c==0 ) System.out.print(key+" is not present");
		else System.out.print(key+" is present\nAppeared "+c+" times");
	}
}