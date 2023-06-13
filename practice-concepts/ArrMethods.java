// Program to demonstrate use of array methods
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		int[] Arr1 = {2,4,5,6,3,1,0,9};
		int[] Arr2 = {2,4,5,6};
		int[] Arr ;
		
		//int binarySearch(arr[],key) - searches the key using binary search algo
		Arrays.sort(Arr1);
		System.out.println( Arrays.binarySearch(Arr1,4));
		
		//int binarySearch(arr[],start,end,key) - searches the key using binary 
		//search algo in a specified range
		Arrays.sort(Arr1);
		System.out.println( Arrays.binarySearch(Arr1,1,5,3));
		
		//int compare(arr1[],arr2[]) - Lexicographically compares two arrays
		System.out.println( Arrays.compare(Arr1,Arr2));
		
		//boolean equals(arr1[],arr2[]) - returns true if two arrays are equal
		System.out.println( Arrays.equals(Arr1,Arr2));
		
		//int[] copyOf(arr[],int length) - copies array of specified length and returns
		Arr = Arrays.copyOf(Arr1,Arr1.length);
		for( int a:Arr ) System.out.print( a + " " );
		System.out.println();
		
		//int[] copyOfRange(arr[],int start, int end) - copies array of specified range 
		//of elements and returns
		Arr = Arrays.copyOfRange(Arr1,2,6); // 2 to 5
		for( int a:Arr ) System.out.print( a + " " );
		System.out.println();
		
		Arr = Arrays.copyOf(Arr1,Arr1.length);
		//void fill(arr[],int val) - Assigns val to each index of the array
		Arrays.fill(Arr,0);
		for( int a:Arr ) System.out.print( a + " " );
		System.out.println();
		
		Arr = Arrays.copyOf(Arr1,Arr1.length);
		//void fill(arr[],int start, int end, int val) - Assigns val to each 
		//index of the array of specified range
		Arrays.fill(Arr,2,6,0); // 2 to 5
		for( int a:Arr ) System.out.print( a + " " );
		System.out.println();
		
		//int mismatch(arr1[],arr2[]) - returns the first index of unmatched elements
		System.out.println(Arrays.mismatch(Arr1,Arr2));
		
		//void sort(arr1[]) - sorts the complete array
		Arrays.sort(Arr1);
		for( int a:Arr1 ) System.out.print( a + " " );
		System.out.println();
		
		//void mismatch(arr1[],start,end) - sorts the array in the specified range
		Arrays.sort(Arr1,1,5);
		for( int a:Arr1 ) System.out.print( a + " " );
		System.out.println();
		
		//String toString(arr[]) - returns string consist of array contents of format
		// [e1,e2,e3,..,en]
		System.out.println(Arrays.toString(Arr1));
		
		// for( int a:Arr ) System.out.print( Arrays.toString(Arr).getClass()); 
	}
}