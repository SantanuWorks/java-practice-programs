// Write a program to find average marks obtained by a class of 30 students. 
import java.util.Scanner;
public class Array7{
	public static void main(String[] args){
		int n = 5;
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		System.out.print("Enter "+n+" numbers: ");
		for( int i = 0; i < n; i++ ) arr[i] = sc.nextInt();
		
		for( int i = 0; i < n/2; i ++ ){
			if( arr[i] != arr[n-1-i] ){ 
				f = false; break; 
			}
		} 
		System.out.print(f);
	}
}