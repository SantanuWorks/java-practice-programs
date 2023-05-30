// program to print following pattern
//
// 	      1
// 	     333
// 	    55555
// 	   7777777
// 	  999999999
// 	
// 	
// 
public class Pattern33{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= i*2-1 ; j ++ ) System.out.print(i*2-1);
			System.out.println();
		}
	}
}