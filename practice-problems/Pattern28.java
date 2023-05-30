// program to print following pattern
//
// 	1
//  22
//  333
//  4444
//  55555
// 	
// 
public class Pattern28{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= i ; j ++ ) System.out.print(i);
			System.out.println();
		}
	}
}