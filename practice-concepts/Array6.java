// Program to demonstrate use of array
public class Array6{
	public static void main(String[] args){
		// array index should lie between 0 and len-1
		// otherwise there will be an exception called as
		// ArrayIndexOutOfBoundsException
		int[] arr = new int[2];
		
		// array can be initialized using index
		arr[0] = 12 ; // okay
		arr[1] = 45 ; // okay 
		// index equals to length of array
		arr[2] = 23 ; // #ArrayIndexOutOfBoundsException
		// index is negative
		arr[-1] = 23 ; // #ArrayIndexOutOfBoundsException
		// index greater than length of array
		arr[5] = 23 ; // #ArrayIndexOutOfBoundsException
	}
}