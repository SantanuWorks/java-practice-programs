// Array practice programs 
// Java Program to Recursively Linearly Search an Element in an Array
public class Array13{
	int srch(int arr[],int k,int i,int n){
		if( arr[i] == k ) return i;
		else if( i == n-1 ) return -1;
		else return srch(arr,k,i+1,n);
	}
	public static void main(String[] args){
		Array13 aObj = new Array13();
		int arr[] = {1,2,4,5,2,5,2,6,3,5};
		int n = 10;
		int key = 5;
		int in = aObj.srch(arr,key,0,n);
		if( in != -1 ) System.out.print(key+" is found at index "+in);
		else System.out.print(key+" is not found");
	}
}