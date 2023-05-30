// program to print following pattern
// 
// *
// **		
// * *            
// *  *          
// *****       
// 
public class Pattern21{
	public static void main(String[] args){
		int step = 15 ;
		step -= 2 ;
		System.out.print("*");
		System.out.println();
		for( int i = 0 ; i < step ; i ++ ){
			System.out.print("*");
			for( int j = 0 ; j < i ; j ++ ) System.out.print(" ");
			System.out.print("*");
			System.out.println();
		}
		for( int i = 0 ; i < step + 2 ; i ++ ) System.out.print("*");
	}
}