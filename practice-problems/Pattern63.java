// program to print following pattern
//
// EEEEEEEEE
//  DDDDDDD
//   CCCCC
//    BBB
//     A	
// 
public class Pattern63{
	public static void main(String[] args){
		int step = 5 ;
		char val = 'A' - 1 ;
		val += step ;
		for( int i = 1 ; i <= step ; i ++ ){
			for( int j = 1 ; j < i ; j ++ ) System.out.print(" ");
			for( int j = 0 ; j < (step - i ) * 2 + 1 ; j ++ ) System.out.print(val);
			System.out.println();
			val -- ;
 		}
	}
}