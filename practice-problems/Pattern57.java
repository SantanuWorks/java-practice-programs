// program to print following pattern
//
// A A A A A 
// B B B B
// C C C
// D D
// E	
// 
public class Pattern57{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A'; 
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i + 1 ; j ++ ) System.out.print(val+" ");
			System.out.println();
			val ++ ;
		}
	}
}