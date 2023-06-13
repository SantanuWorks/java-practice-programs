// Program to demonstrate use of array - multidimensional arrays
public class Array7{
	public static void main(String[] args){
		// declaring multidimensional arrays
		// 2d array
		int arr1[][] = new int[2][2];
		
		// accesing index
		// inserting value
		arr1[0][0] = 1 ;
		arr1[0][1] = 2 ;
		arr1[1][0] = 3 ;
		arr1[1][1] = 4 ;
		
		// get value
		System.out.print(arr1[0][0]);
		System.out.print(arr1[0][1]);
		System.out.println();
		System.out.print(arr1[1][0]);
		System.out.print(arr1[1][1]);
		System.out.println();
		
		// 3d array
		int arr2[][][] = new int[1][2][2];
		
		// accesing index
		// inserting value
		arr2[0][0][0] = 1 ;
		arr2[0][0][1] = 2 ;
		arr2[0][1][0] = 3 ;
		arr2[0][1][1] = 4 ;
		
		// get value
		System.out.print(arr2[0][0][0]);
		System.out.print(arr2[0][0][1]);
		System.out.println();
		System.out.print(arr2[0][1][0]);
		System.out.print(arr2[0][1][1]);
	}
}