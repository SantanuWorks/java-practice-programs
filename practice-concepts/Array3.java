// Program to demonstrate use of array
public class Array3{
	public static void main(String[] args){
		// accessing the array elements - using index
		int[] arr = { 1, 3, 5, 7, 9 };
		int len = 5 ;
		// manually accessing each element
		System.out.println("Arr["+0+"] = "+arr[0]);
		System.out.println("Arr["+1+"] = "+arr[1]);
		System.out.println("Arr["+2+"] = "+arr[2]);
		System.out.println("Arr["+3+"] = "+arr[3]);
		System.out.println("Arr["+4+"] = "+arr[4]);
		
		System.out.println();
		
		// basic for loop can access each element ( while and do while can be used )
		for( int i = 0; i < len ; i ++ )
			System.out.println("Arr["+i+"] = "+arr[i]);
		
		System.out.println();
		
		// for-each loop can access each element without index
		System.out.print("Elements are: ");
		for( int a:arr )
			System.out.print(a+" ");
	}
}