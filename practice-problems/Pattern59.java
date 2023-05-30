// program to print following pattern
//
//     A
//    BB
//   CCC
//  DDDD
// EEEEE 	
// 
public class Pattern59{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A' ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= i ; j ++ ) System.out.print(val);
			System.out.println();
			val ++ ;
		}
	}
}