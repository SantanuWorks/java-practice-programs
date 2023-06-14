// Program to to implement Selection Sort
import java.util.Arrays;
public class SelectionSort{
	public static void main(String[] args){
		int[] arr = {1,3,-2,-42,22,12,-23,23,-23,10,2,4,5,6,1,4,-2,0,-2,42,42,1,42,52,21,42,14,42,24,24,24,24,223,23232,32};
		int n = 35;
		int temp ;
		
		System.out.print("Before Sorting: \n");
		for( int a: arr ) System.out.print(a+" "); 
			
		for( int i = 0 ; i < n - 1 ; i ++ ){
			for( int j = i+1 ; j < n ; j ++ ){
				if( arr[i] > arr[j] ){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			}
		}
		
		System.out.print("\nAfter Sorting: \n");
		for( int a: arr ) System.out.print(a+" "); 
	}
}