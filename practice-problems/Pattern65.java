// program to print following pattern
//
//      F
//     EF
//    DEF
//   CDEF
//  BCDEF
// ABCDEF
//  BCDEF
//   CDEF
//    DEF
//     EF
//      F
// 
public class Pattern65{
	public static void main(String[] args){
		int steps = 6 ;
		char val = 'A' ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i + 1 ; j ++, val++ ) System.out.print(" ");
			val--;
			for( int j = 1 ; j <= i ; j ++, val++ ) System.out.print(val);
			System.out.println();
			val = 'A';
		}
		steps--;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 0 ; j <= i ; j ++, val++ ) System.out.print(" ");
			val-- ;
			for( int j = 0 ; j <= steps - i ; j ++, val++ ) System.out.print(val);
			System.out.println();
			val = 'A';
		}
	}
}