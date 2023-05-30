// program to print following pattern
//
// 			*
// 		   * *
// 		  *   *
// 	     *     *
// 	    *       *
// 
public class Pattern11{
	public static void main(String[] args){
		int step = 5;
		int space = 1 ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j < step - 1 - i ; j ++ ) System.out.print(" ");
			if( i == 0 ) System.out.print("*");
			else{
				System.out.print("*");
				for( int j = 0 ; j < space ; j ++ ) System.out.print(" ");
				System.out.print("*");
				space += 2 ;
			}
			System.out.println();
		}
	}
}