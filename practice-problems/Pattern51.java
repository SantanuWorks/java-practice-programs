// program to print following pattern
//
// E E E E E 
// D D D D D
// C C C C C
// B B B B B
// A A A A A
// 
public class Pattern51{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A' - 1 ;
		val += steps ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps ; j ++ ) System.out.print(val+" ");
			System.out.println();
			val -- ;
		}
	}
}