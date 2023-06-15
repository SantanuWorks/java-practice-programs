// Write a program to find the sum of even and odd numebers.
public class Array9{
	public static void main(String[] args){
		int esum = 0 ;
		int osum = 0 ;
		int n = 10 ;
		int[] arr = {1,2,3,23,423,42,4,23,4,34};
		
		for( int i = 0; i < n; i++ ){
			if( arr[i] % 2 == 0 ) esum += arr[i];
			else osum += arr[i] ;
		}

		System.out.print("Sum of even numbers: "+esum);
		System.out.print("\nSum of odd numbers: "+osum);
	}
}