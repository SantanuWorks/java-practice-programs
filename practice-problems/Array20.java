// Array practice programs 
// Java Program to Find Common Array Elements between two arrays
import java.util.Arrays;
public class Array20{
	public static void main(String[] args){
		int arr1[] = {1,4,4,3,8,4,7,4,8,9,0,2,9,1,5,5,8,3,7,3};
		int arr2[] = {3,4,1,2,3,4,7,8,3,8,3,8,3,0};
		int s1 = arr1.length;
		int s2 = arr2.length;
		int s = s1+s2;
		int in=0;
		int arr[] = new int[s];
		for( int i=0; i<s1; i++ ) arr[i] = arr1[i];
		for( int i=0; i<s2; i++ ) arr[s1+i] = arr2[i];
		Arrays.sort(arr);
		for( int i=0; i<s-1; i++ ){
			if( i!=0 ){
				if( arr[i] == arr[i-1] ) continue;
			}
			if( arr[i] == arr[i+1] ){
				arr1[in] = arr[i];
				in++;
			}
		}
		for( int i=0; i<in; i++ ) System.out.print(arr1[i]+" ");
	}
}