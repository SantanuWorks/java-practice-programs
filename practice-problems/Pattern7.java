// program to print following pattern
//
// *****
//  ****	
//   ***	
//    **	
//     *	      
// 
public class Pattern7{
	public static void main(String[] args){
		int step = 5 ;
		for( int i = 1 ; i <= step ; i++ ){
			for( int j = 0 ; j < i - 1 ; j ++ )
				System.out.print(" ");
			for( int j = 0 ; j < step + 1 - i ; j ++ )
				System.out.print("*");
			System.out.println();
		}
	}
}