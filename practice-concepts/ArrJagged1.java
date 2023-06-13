// Program to demonstrate use of array - jagged arrays
public class ArrJagged1{
	public static void main(String[] args){
		// declaration 
		int ar[][] = new int[4][];
		
		// initialize - way 1
		int Arr1[][] = new int[][]{
			new int[] {1,2,3,4},
			new int[] {1,2,3},
			new int[] {1,2,3,4,5,6}
		};
		
		// initialize - way 2
		int Arr2[][] = {
			new int[] {1,2,3,4},
			new int[] {1,2,3},
			new int[] {1,2,3,4,5,6}
		};
		
		// initialize - way 2
		int Arr3[][] = {
			{1,2,3,4},
			{1,2,3},
			{1,2,3,4,5,6}
		};
	}
}