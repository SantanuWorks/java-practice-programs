// program to print following pattern
//
// 	1
// 	12
// 	123
// 	1234
// 	12345
// 	
// 	
// 
public class Pattern29{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= i ; j ++ ) System.out.print(j);
			System.out.println();
		}
	}
}