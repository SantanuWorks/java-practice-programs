// program to print following pattern
//
// ABCDE
//  ABCD
//   ABC
//    AB
//     A	
// 
public class Pattern61{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A' ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j < i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= steps - i + 1 ; j ++, val++ ) System.out.print(val);
			System.out.println();
			val = 'A' ;
		}
	}
}