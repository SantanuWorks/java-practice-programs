// Program to demonstrate use of array - multidimensional arrays
// user input
import java.util.Scanner;
public class Array9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// innitializing multidimensional arrays using loops
		// 2d array
		// loop method
		int arr1[][] = new int[2][2]; 
		System.out.print("Enter all the elements: ");
		for(int i = 0 ; i < 2 ; i ++){
			for(int j = 0 ; j < 2 ; j ++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements are: ");
		for(int i = 0 ; i < 2 ; i ++){
			for(int j = 0 ; j < 2 ; j ++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}