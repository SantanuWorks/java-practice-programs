// Program to demonstrate use of array - jagged arrays
public class ArrJagged2{
	public static void main(String[] args){
		// initialize 
		int Arr[][] = {
			{1,2,3,4},
			{1,2,3},
			{1,2,3,4,5,6},
			{1,2,3,4,5}
		};
		
		// printing
		for( int i = 0 ; i < Arr.length ; i ++ ){
			for( int j = 0 ; j < Arr[i].length ; j ++ ){
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}