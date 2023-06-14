// Program to to implement Bubble Sort
import java.util.Arrays;
public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {2,4,5,6,1,4,-2,0,-2,42,42,1,42,52,21,42,14,42,24,24,24,24,223,23232,32};
		int n = 25;
		int temp ;
		
		System.out.print("Before Sorting: \n");
		for( int a: arr ) System.out.print(a+" "); 
			
		for( int i = 0 ; i < n-1 ; i ++ ){
			for( int j = 0 ; j < n-1 ; j ++ ){
				if( arr[j] > arr[j+1] ){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} 
			}
		}
		
		System.out.print("\nAfter Sorting: \n");
		for( int a: arr ) System.out.print(a+" "); 
	}
}