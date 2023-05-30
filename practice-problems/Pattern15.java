// program to print following pattern
//			
//        *       * 			
//         *     * 			
//          *   * 			
//           * * 			
//            * 			  
// 
public class Pattern15{
	public static void main(String[] args){
		int step = 60;
		int space = 2*(step - 1) ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j < i ; j ++ ) System.out.print(" ");
			if( i == step - 1 ) System.out.print("*");
			else{
				System.out.print("*");
				for( int j = 1 ; j < space ; j ++ ) System.out.print(" ");
				System.out.print("*");
				space -= 2 ;
			}
			System.out.println();
		}
	}
}