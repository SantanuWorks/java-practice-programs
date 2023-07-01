// Array practice programs 
// Java Program to Merge Two Arrays
public class Array18{
	public static void main(String[] args){
		int arr1[] = {};
		int arr2[] = {};
		int n1 = arr1.length ;
		int n2 = arr2.length ;
		int n = n1 + n2 ;
		int arr[] = new int[n];
		System.out.print("First array is ");
		for(int i = 0; i < n1; i++) System.out.print(arr1[i]+" ");
		System.out.print("\nSecond array is ");
		for(int i = 0; i < n2; i++) System.out.print(arr2[i]+" ");
		for( int i = 0 ; i < n1 ; i ++ ) arr[i] = arr1[i];
		for( int i = 0 ; i < n2 ; i ++ ) arr[n1+i] = arr2[i];
		System.out.print("\nResulting array is ");
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" ");
	}
}