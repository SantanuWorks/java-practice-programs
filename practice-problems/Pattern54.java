// program to print following pattern
//
// A 
// A B
// A B C
// A B C D
// A B C D E	
// 
public class Pattern54{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A' ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= i ; j ++, val ++ ) System.out.print(val+" ");
			System.out.println();
			val = 'A' ;
		}
	}
}