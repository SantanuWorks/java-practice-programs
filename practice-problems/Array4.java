// Write a program to find no of positive, negative, even and odd numbers in array of 25 elements.
import java.util.Scanner;
public class Array4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[25];
		int pos = 0, neg = 0, even = 0, odd = 0;
		System.out.print("Enter 25 numbers: ");
		for(int i = 0; i < 25; i++) arr[i] = sc.nextInt();
		for(int i = 0; i < 25; i++){
			if( arr[i] < 0 ) neg++ ;
			else if( arr[i] > 0 ) pos++ ;
			if( arr[i] % 2 == 0 ) even++ ;
			else if( arr[i] % 2 == 1 ) odd++ ;
		}
		System.out.print("Summary:\n"+"Positives: "+pos+"\nNegtives: "+neg+"\nEvens: "+even+"\nOdds: "+odd);
	}
}