// program to print following pattern
//
// 	       1
// 	      321
// 	     54321
// 	    7654321
// 	   987654321
// 	
// 	
// 
public class Pattern35{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i ; j ++ ) System.out.print(" ");
			for( int j = i*2-1 ; j >= 1  ; j -- ) System.out.print(j);
			System.out.println();
		}
	}
}