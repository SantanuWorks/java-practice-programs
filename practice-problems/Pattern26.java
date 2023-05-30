// program to print following pattern
//	
// 55555
// 44444
// 33333
// 22222
// 11111 	
// 
public class Pattern26{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps ; j ++ ) System.out.print(steps - i + 1);
			System.out.println();
		}
	}
}