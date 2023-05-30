// program to print following pattern
//
// 	5 5 5 5 5 
// 	 4 4 4 4
// 	  3 3 3
// 	   2 2
// 	    1
// 	
// 	
// 
public class Pattern37{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j < i ; j ++ ) System.out.print(" ");
			for( int j = 1 ; j <= steps - i + 1 ; j ++ ) System.out.print(steps - i + 1+" ");
			System.out.println();
		}
	}
}