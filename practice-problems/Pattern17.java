// program to print following pattern
//
// 	*********
// 	**** ****
// 	***   ***
// 	**     **
// 	*       *
//  
public class Pattern17{
	public static void main(String[] args){
		int step = 15 ;
		for( int i = 0 ; i < step * 2 - 1; i ++ ) System.out.print("*");
		System.out.println();
		step-- ;
		for( int j = 0 ; j < step ; j ++ ){
			for( int i = 0 ; i < step - j ; i ++ ) System.out.print("*");
			for( int i = 0 ; i < j*2 + 1 ; i ++ ) System.out.print(" ");
			for( int i = 0 ; i < step - j ; i ++ ) System.out.print("*");
			System.out.println();
		}
	}
}