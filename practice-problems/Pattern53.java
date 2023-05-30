// program to print following pattern
//
// A 
// B B
// C C C
// D D D D
// E E E E E 	
// 
public class Pattern53{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A' ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= i ; j ++ ) System.out.print(val+" ");
			System.out.println();
			val ++ ;
		}
	}
}