// program to print following pattern
//
// 	       5
//        45
// 	     345
// 	    2345
// 	   12345
// 	  012345
// 	   12345
// 	    2345
// 	     345
// 	      45
// 	       5
// 
public class Pattern42{
	public static void main(String[] args){
		int steps = 9 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i + 1 ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= i ; j ++ ) System.out.print(steps-i+j-1);
			System.out.println();
		}
		steps--;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 0 ; j <= i ; j ++ ) System.out.print(" ");
			for( int j = 0 ; j <= steps - i ; j ++ ) System.out.print(i+j);
			System.out.println();
		}
	}
}