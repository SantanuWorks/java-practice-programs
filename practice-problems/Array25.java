// Array practice programs 
// Java Program to Find the Normal and Trace of a Matrix
// Normal of a matrix is defined as the square root of the sum of squares of all the elements of the matrix.
// Trace of a given square matrix is defined as the sum of all the elements in the diagonal.
public class Array25{
	public static void main(String[] args){
		int a[][] = {
			{1,2,3,3,5,3},
			{1,0,3,4,2,5},
			{1,2,3,3,2,5},
			{1,2,3,3,5,3},
			{1,2,3,3,5,3},
			{1,0,3,4,2,5}
		};
		int m = a.length;
		int trace = 0;
		double normal = 0.0;
		int nv = 0;
		System.out.print("Given Matrix:\n");
		for( int i = 0; i < m; i ++ ){
			for( int j = 0; j < m; j ++ ) System.out.print(a[i][j]+" ");
			System.out.println();
		}
		for(int i=0; i<m; i++) trace += a[i][i];
		for(int i=0; i<m; i++)
			for(int j=0; j<m; j++)
				nv += (a[i][j]*a[i][j]);
		normal = Math.sqrt(nv);
		System.out.println("Trace of matrix is "+trace);
		System.out.print("Normal of matrix is "+normal);
	}
}