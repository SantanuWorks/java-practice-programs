// program to print following pattern
//
// 	12345
// 	 1234
// 	  123
// 	   12
// 	    1
// 	
// 	
// 
public class Pattern31{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j < i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= steps - i + 1 ; j ++ ) System.out.print(j);
			System.out.println();
		}
	}
}