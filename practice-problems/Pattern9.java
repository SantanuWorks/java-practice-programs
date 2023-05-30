// program to print following pattern
//
// * 			
// **			
// ***			
// ****			
// *****			
// ****			
// ***			
// **			
// * 
// 
public class Pattern9{
	public static void main(String[] args){
		int val = 1 ;
		int step = 5 ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j <= i ; j ++ )
				System.out.print("*");
			System.out.println();	
		}
		for( int i = step - 1 ; i >= 0 ; i -- ){
			for( int j = 0 ; j < i ; j ++ )
				System.out.print("*");
			System.out.println();	
		}
	}
}