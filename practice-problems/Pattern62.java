// program to print following pattern
//
//     A
//    BBB
//   CCCCC
//  DDDDDDD
// EEEEEEEEE
// 
public class Pattern62{
	public static void main(String[] args){
		int step = 5 ;
		char val = 'A' ;
		for( int i = 1 ; i <= step ; i ++ ){
			for( int j = 0 ; j < step - i ; j ++ ) System.out.print(" ");
			for( int j = 0 ; j < i * 2 - 1 ; j ++ ) System.out.print(val);
			System.out.println();
			val ++ ;
 		}
	}
}