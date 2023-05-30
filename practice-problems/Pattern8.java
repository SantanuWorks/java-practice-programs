// program to print following pattern
//
// * * * * *			
//  * * * *          
//   * * *        
//    * *
//     *            
// 
public class Pattern8{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 0 ; j < i - 1 ; j ++ ) System.out.print(" ");
			for( int j = 0 ; j < steps + 1 - i ; j ++ ) System.out.print("* ");
			System.out.println();
		}
	}
}