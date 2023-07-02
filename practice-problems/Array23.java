// Array practice programs 
// Java Program to Sort the 2D Array Across Columns
public class Array23{
	public static void main(String[] args){
		int arr[][] = {
			{1,2,3,2,5,2,5,3,2,2,5,3,5,2,4,2},
			{-1,0,3,5,1,4,-6,5,4,8,3,-1,8,4,2,3},
			{1,-2,-3,3,2,7,9,4,9,4,8,3,8,4,8,6}
		};
		int m = arr.length; int n = arr[0].length;
		System.out.print("Before Sorting:\n");
		for( int i = 0; i < m; i ++ ){
			for( int j = 0; j < n; j ++ ) System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		for(int i=0; i<m; i++){
			for(int j = 0; j < n-1; j++){
				for( int k = j; k < n; k++ ){
					if( arr[i][j] > arr[i][k] ){
						int temp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = temp;
					}
				}
			}
		}
		System.out.print("\nAfter Sorting:\n");
		for( int i = 0; i < m; i ++ ){
			for( int j = 0; j < n; j ++ ) System.out.print(arr[i][j]+" ");
			System.out.println();
		}		
	}
}