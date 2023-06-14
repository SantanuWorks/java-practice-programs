// Write a program to generate prime numbers from 1 to 100 - Sieve of Eratosthenes.
import java.util.Scanner;
public class Array3{
	public static void main(String[] args){
		int n = 1000;
		int arr[] = new int[n];
		for( int i = 2; i <= n ; i++ ) arr[i-1] = i;
		for( int i = 2 ; i < n ; i++ ) if( arr[i] % arr[1] == 0 ) arr[i] = 0 ;
		for( int i = 2 ; i < n ; i ++ ) if( arr[i] != 0 ) for( int j = i+1 ; j < n ; j++ ) if( arr[j] % arr[i] == 0 ) arr[j] = 0 ;
		for( int a:arr ) if( a != 0 ) System.out.print(a+" ");
	}
}