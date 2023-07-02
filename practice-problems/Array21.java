// Array practice programs 
// Java Program For Array Rotation
public class Array21{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int k =12; // rotate to left by k times
		System.out.print("Original Array is ");
		for( int i=0; i<n; i++ ) System.out.print(arr[i]+" ");
		int t=0;
		if( k%n != 0 ){
			for( int i=0; i<k; i++ ){
				t = arr[0];
				for( int j=0; j<n-1; j++ ) arr[j] = arr[j+1];
				arr[n-1] = t;
			}
		}
		System.out.print("\nRotated Array is ");
		for( int i=0; i<n; i++ ) System.out.print(arr[i]+" ");
	}
}