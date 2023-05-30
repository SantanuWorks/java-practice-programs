// program to print following pattern
//
// 	      1
// 	     123
// 	    12345
// 	   1234567
// 	  123456789
// 	
// 	
// 
public class Pattern34{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= i*2-1 ; j ++ ) System.out.print(j);
			System.out.println();
		}
	}
}