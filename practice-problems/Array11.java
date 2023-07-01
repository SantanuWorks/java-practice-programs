// Array practice programs 
// Java Program to Search an Element in an Array - Linear Search
import java.util.*;
public class Array11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, key;
		System.out.print("Enter size of array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter each element of array: ");
		for( int i = 0 ; i < n ; i ++ ) arr[i] = sc.nextInt();
		System.out.print("Enter the key to search: ");
		key = sc.nextInt();
		int in = -1;
		for( int i = 0 ; i < n ; i ++ )
			if( arr[i] == key ){ in = i; break; }
		if( in != -1 ) System.out.print(key+" is found at index "+in);
		else System.out.print(key+" is not found");
		sc.close();
	}
}