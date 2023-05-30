// program to print following pattern
//	
//			*
//		   * *
//		  *	* *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//			*   
// 
public class Pattern10{
	public static void main(String[] args){
		int step = 5 ;
		for( int i = 1 ; i <= step ; i ++ ){
			for( int j = 0 ; j < step - i ; j ++ ) System.out.print(" ");
			for( int j = 0 ; j < i ; j ++ ) System.out.print("* ");
			System.out.println();
		}
		for( int i = 1 ; i <= step - 1 ; i ++ ){
			for( int j = 0 ; j < i ; j ++ ) System.out.print(" ");
			for( int j = 0 ; j < step - i ; j ++ ) System.out.print("* ");
			System.out.println();
		}
	}
}