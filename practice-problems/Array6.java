// Write a program to copy the contents of one array into another in the reverse order.
import java.util.Scanner;
public class Array6{
	public static void main(String[] args){
		int n = 15;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		int[] rev = new int[n];
		System.out.print("Enter "+n+" numbers: ");
		for( int i = 0; i < n; i++ ) arr[i] = sc.nextInt();
		System.out.println("Original Array: ");
		
		for( int a:arr ) System.out.print(a+" ");
		System.out.println();
		
		for( int i = 0; i < n; i ++ ) rev[i] = arr[n-i-1];

		System.out.println("Reverse Array: ");
		for( int a:rev ) System.out.print(a+" ");
	}
}