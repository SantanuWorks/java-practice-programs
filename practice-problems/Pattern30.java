// program to print following pattern
//
// 	11111
// 	2222
// 	333
// 	44
// 	5
// 	
// 	
// 
public class Pattern30{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i + 1 ; j ++ ) System.out.print(i);
			System.out.println();
		}
	}
}