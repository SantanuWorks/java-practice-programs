// Program to demonstrate use of array - jagged arrays
// user input
import java.util.Scanner;
public class ArrJagged4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// initialize - static 
		int size ;
		System.out.print("Enter no of rows in jagged array: ");
		size = sc.nextInt();
		int Arr[][] = new int[size][];
		
		// input
		for( int i = 0 ; i < Arr.length ; i ++ ){
			System.out.print("Enter size of row "+(i+1)+": ");
			size = sc.nextInt();
			Arr[i] = new int[size];
			System.out.print("Enter values for row "+(i+1)+": ");
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