// Program to to implement Insertion Sort
import java.util.Arrays;
public class InsertionSort{
	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		int n = 5;
		int si = 0 ;
		int t ; 
		
		System.out.print("Before Sorting: \n");
		for( int a: arr ) System.out.print(a+" "); 
			
		for( int i = 1 ; i < n ; i ++ ){
			si = i;
			t = arr[i];
			for( int j = i ; j >= 0 ; j -- ){
				if( arr[j] > arr[i] ) si = j ;
			}
			for( int j = i ; j > si ; j -- ){
				arr[j] = arr[j-1];
			}
			arr[si] = t ;
		}
		
		System.out.print("\nAfter Sorting: \n");
		for( int a: arr ) System.out.print(a+" "); 
	}
}