// Array practice programs 
// Java Program to Sort an Array
public class Array14{
	public static void main(String[] args){
		int arr[] = {1,3,4,2,4,2,4,4,2,4,2,2,6,7,3};
		int n = 15;
		System.out.print("Given array is ");
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" ");
		for(int i = 0; i < n-1; i++){
			for( int j = 0; j < n-1; j ++ ){
				if( arr[j] > arr[j+1] ){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted array is ");
		for( int i = 0 ; i < n ; i ++ ) System.out.print(arr[i]+" ");
	}
}