// program to print following pattern
//
// 	11111
//  22222
//  33333
//  44444
//  55555
// 
public class Pattern24{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps ; j ++ ) System.out.print(i);
			System.out.println();
		}
	}
}