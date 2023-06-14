// Write a program to find the smallest number in an array of 25 integers.
import java.util.Scanner;
public class Array8{
	public static void main(String[] args){
		int n = 25;
		int small;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		
		System.out.print("Enter "+n+" numbers: ");
		for( int i = 0; i < n; i++ ) arr[i] = sc.nextInt();
		
		small = arr[0];
		
		for( int i = 1; i < n; i ++ ) if( arr[i] < small ) small = arr[i];

		System.out.print("Smallest Element: "+small);
	}
}