// Write a program to print the pascal triangle
// 
// 					1
//                1   1
//              1   2   1
//            1   3   3   1
//          1   4   6   4   1
//
public class Pattern3{
	public static void main(String[] args){
		int steps = 10 ;
		int val ;
		for( int i = 1 ; i <= steps ; i ++ ){
			val = 1 ;
			for( int j = 0 ; j < steps - i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= i ; j ++ ){
				System.out.print(val+" ");
				val = val * ( i - j ) / j ;
			}
			System.out.println();
		}
	}
}