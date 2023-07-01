// Array practice programs 
// Java Program to Search an Element in an Array - Binary Search
import java.util.*;
public class Array12{
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
		Arrays.sort(arr);
		System.out.print("Given array is ");
		for( int i = 0 ; i < n ; i ++ ) System.out.print(arr[i]+" ");
		int l = 0; int r = n-1;
		int mid = (l+r)/2;
		int in = -1;
		while( l != r ){
			if( arr[mid] == key ){ in = mid; break; }
			if( key < arr[mid] ) r = mid-1;
			else l = mid+1;
			mid = (l+r)/2;
		}
		System.out.println();
		if( in != -1 ) System.out.print(key+" is found at index "+in);
		else System.out.print(key+" is not found");
		sc.close();
	}
}