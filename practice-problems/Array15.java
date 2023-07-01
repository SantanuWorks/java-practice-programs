// Array practice programs 
// Java Program to Sort an Array
public class Array15{
	public static void main(String[] args){
		int arr[] = {1,3,4,2,4,2,4,4,2,4,2,2,6,7,3};
		int n = 15;
		System.out.print("Given array is ");
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" ");
		for(int i = 0; i < n-1; i++){
			for( int j = i; j < n; j ++ ){
				if( arr[i] > arr[j] ){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted array is ");
		for( int i = 0 ; i < n ; i ++ ) System.out.print(arr[i]+" ");
	}
}