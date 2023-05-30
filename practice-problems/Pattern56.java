// program to print following pattern
//
// A B C D E 
// A B C D
// A B C
// A B
// A	
// 
public class Pattern56{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A'; 
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i + 1 ; j ++, val++ ) System.out.print(val+" ");
			System.out.println();
			val = 'A' ;
		}
	}
}