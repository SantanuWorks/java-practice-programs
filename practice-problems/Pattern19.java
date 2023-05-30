// program to print following pattern
//
// *****	
// ****	
// ***	
// **	
// *	
// **	
// ***	
// ****	
// *****	
//          
public class Pattern19{
	public static void main(String[] args){
		int step = 5 ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j < step - i ; j ++ ) System.out.print("*");
			System.out.println();
		}
		step -- ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j <= i + 1 ; j ++ ) System.out.print("*");
			System.out.println();
		}
	}
}