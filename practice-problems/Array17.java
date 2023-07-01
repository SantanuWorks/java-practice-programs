// Array practice programs 
// Java Program to Remove All Occurrences of an Element in an Array
public class Array17{
	public static void main(String[] args){
		int arr[] = {1,1,1,1,1};
		int n = 5;
		int key = 1;
		System.out.print("Given array is ");
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" ");
		for(int i=0; i<n; i++){
			if(arr[i]==key){
				for(int j=i; j<n-1; j++) arr[j] = arr[j+1];
				n--;
				i--;
			}
		}
		System.out.print("\nResulting array is ");
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" ");
	}
}