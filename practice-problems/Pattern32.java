// program to print following pattern
//
//        1
// 	     222
// 	    33333
// 	   4444444
// 	  555555555
// 	
// 	
// 
public class Pattern32{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= i*2-1 ; j ++ ) System.out.print(i);
			System.out.println();
		}
	}
}