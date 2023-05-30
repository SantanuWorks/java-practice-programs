// program to print following pattern
// 
// *         *
// **       **
// ***     ***
// ****   ****
// ***** *****
// ***********
// 			
public class Pattern18{
	public static void main(String[] args){
		int step = 15 ;
		for( int j = 0 ; j < step - 1 ; j ++ ){
			for( int i = 0 ; i <= j ; i ++ ) System.out.print("*");
			for( int i = 1 ; i < (step - 1 - j)*2  ; i ++ ) System.out.print(" ");
			for( int i = 0 ; i <= j ; i ++ ) System.out.print("*");
			System.out.println();
		}
		for( int i = 0 ; i < step*2 - 1; i ++ ) System.out.print("*");
	}
}