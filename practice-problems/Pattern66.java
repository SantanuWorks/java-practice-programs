// program to print following pattern
//
//      A 
//     B B
//    C C C
//   D D D D
//  E E E E E
// F F F F F F
//  E E E E E
//   D D D D
//    C C C
//     B B
//      A	
// 
public class Pattern66{
	public static void main(String[] args){
		int steps = 6 ;
		char val = 'A' ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= i ; j ++ ) System.out.print(val+" ");
			System.out.println();
			val ++ ;
		}
		steps -- ;
		val -= 2 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= steps - i + 1 ; j ++ ) System.out.print(val+" ");
			System.out.println();
			val -- ;
		}
	}
}