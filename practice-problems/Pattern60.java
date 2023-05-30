// program to print following pattern
//
//     A
//    AB
//   ABC
//  ABCD
// ABCDE	
// 
public class Pattern60{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A' ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= i ; j ++, val++ ) System.out.print(val);
			System.out.println();
			val = 'A' ;
		}
	}
}