// Program to demonstrate use of array
public class Array5{
	public static void main(String[] args){
		// Below arrays are initialized with their default values
		int[] arr = new int[5];
		
		// array can be initialized using index
		arr[0] = 12 ;
		arr[1] = 45 ;
		arr[2] = 23 ;
		arr[3] = 64 ;
		arr[4] = 19 ;
		
		// Printing values of array
		for( int i = 0; i < 5 ; i ++ )
			System.out.println("Arr["+i+"] = "+arr[i]);
	}
}