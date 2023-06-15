// Write a program to find sum and average of elements in a array.
import java.util.Scanner;
public class Array10{
	public static void main(String[] args){
		int sum = 0 ;
		float avg ;
		int n = 10 ;
		int[] arr = {1,2,3,23,423,42,4,23,4,34};
		
		for( int i = 0; i < n; i++ ){
			sum += arr[i];
		}
		
		avg = (float)sum / n ;
		
		System.out.print("Sum of elements: "+sum);
		System.out.print("\nAverage of elements: "+avg);
	}
}