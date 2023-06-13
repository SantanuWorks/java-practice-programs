// Program to demonstrate use of array - multidimensional arrays
public class Array8{
	public static void main(String[] args){
		// innitializing multidimensional arrays
		// 2d array
		// direct method
		int arr1[][] = {
			{1,2},
			{3,4}
		};
		
		// get value
		System.out.print(arr1[0][0]);
		System.out.print(arr1[0][1]);
		System.out.println();
		System.out.print(arr1[1][0]);
		System.out.print(arr1[1][1]);
		System.out.println();
		
		// 3d array
		// direct method
		int arr2[][][] = {
			{
				{1,2},
				{3,4}
			}
		};
		
		// get value
		System.out.print(arr2[0][0][0]);
		System.out.print(arr2[0][0][1]);
		System.out.println();
		System.out.print(arr2[0][1][0]);
		System.out.print(arr2[0][1][1]);
	}
}