// program to demonstrate the nested loops
public class NestedLoop{
	public static void main(String[] args){
		// print 3x3 matrix 
		for( int i = 0 ; i < 3 ; i ++ ){
			for( int j = 0 ; j < 3 ; j ++ ){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		// print 4x4 matrix 
		int i = 1, j = 1 ;
		while( i <= 4 ){
			while( j <= 4 ){
				System.out.print(j + " ");
				j ++ ;
			}
			System.out.println();
			i ++ ;
			j = 1 ;
		}
		System.out.println();
		// print 5x5 matrix 
	    i = 1 ; j = 1 ;
		do{
			do{
				System.out.print(j + " ");
				j ++ ;
			} while( j <= 5 );
			System.out.println();
			i ++ ;
			j = 1 ;
		} while( i <= 5 );
	}
}