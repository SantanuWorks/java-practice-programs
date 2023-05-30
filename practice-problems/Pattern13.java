// program to print following pattern
//        
//       *********
//        *******
//         ***** 
//          ***
//           *
// 
public class Pattern13{
	public static void main(String[] args){
		int step = 15 ;
		for( int i = step ; i > 0 ; i -- ){
			for( int j = 0 ; j < step - i ; j ++ ) System.out.print(" ");
			for( int j = 0 ; j < i * 2 - 1 ; j ++ ) System.out.print("*");
			System.out.println();
 		}
	}
}