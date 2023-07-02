// Array practice programs 
// Java Program to find transpose of a matrix - square matrix
public class Array24{
	public static void main(String[] args){
		int a[][] = {
			{1,2,3,4,5,6},
			{7,8,9,10,11,12},
			{13,14,15,16,17,18},
			{1,2,3,4,5,6},
			{7,8,9,10,11,12},
			{13,14,15,16,17,18}
		};
		int m = a.length;
		System.out.print("Original Matrix:\n");
		for( int i = 0; i < m; i ++ ){
			for( int j = 0; j < m; j ++ ) System.out.print(a[i][j]+" ");
			System.out.println();
		}
		for(int i = 0; i < m; i++){
			for(int j = i+1; j < m; j++){
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		System.out.print("Transpose Matrix:\n");
		for( int i = 0; i < m; i ++ ){
			for( int j = 0; j < m; j ++ ) System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}