// Array practice programs 
// Java Program to Add Two Matrices
public class Array22{
	public static void main(String[] args){
		int a[][] = {
			{1,2,3},
			{-1,0,3},
			{1,-2,-3}
		};
		int b[][] = {
			{-1,-2,-3},
			{1,0,-3},
			{-1,2,3}
		};
		
		int m = a.length;
		int n = a[0].length;
		
		int c[][] = new int[m][n];
		
		for( int i = 0; i < m; i ++ )
			for( int j = 0; j < n; j ++ )
				c[i][j] = a[i][j] + b[i][j];
		
		System.out.println("A = ");
		for( int i = 0; i < m; i ++ ){
			for( int j = 0; j < n; j ++ ) System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("\nB = ");
		for( int i = 0; i < m; i ++ ){
			for( int j = 0; j < n; j ++ ) System.out.print(b[i][j]+" ");
			System.out.println();
		}
		System.out.println("\nC = A+B = ");
		for( int i = 0; i < m; i ++ ){
			for( int j = 0; j < n; j ++ ) System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}
}