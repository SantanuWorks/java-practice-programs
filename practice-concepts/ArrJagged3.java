// Program to demonstrate use of array - jagged arrays
// user input
import java.util.Scanner;
public class ArrJagged3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// initialize - static 
		int Arr[][] = new int[4][];
		Arr[0] = new int[3];
		Arr[1] = new int[4];
		Arr[2] = new int[1];
		Arr[3] = new int[5];
		
		// input
		System.out.print("Enter values: ");
		for( int i = 0 ; i < Arr.length ; i ++ ){
			for( int j = 0 ; j < Arr[i].length ; j ++ ){
				Arr[i][j] = sc.nextInt();
			}
		}
		
		// print
		System.out.println("Jagged Array: ");
		for( int i = 0 ; i < Arr.length ; i ++ ){
			for( int j = 0 ; j < Arr[i].length ; j ++ ){
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}