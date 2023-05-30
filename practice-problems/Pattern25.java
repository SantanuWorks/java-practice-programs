// program to print following pattern
//
// 	12345
//  12345
//  12345
//  12345
//  12345
// 
public class Pattern25{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps ; j ++ ) System.out.print(j);
			System.out.println();
		}
	}
}