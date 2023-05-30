// program to print following pattern
//
// A B C D E 
// A B C D E
// A B C D E
// A B C D E
// A B C D E
// 
public class Pattern50{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A' ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps ; j ++, val++ ) System.out.print(val+" ");
			System.out.println();
			val = 'A' ;
		}
	}
}