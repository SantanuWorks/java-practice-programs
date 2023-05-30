// program to print following pattern
//
// 	1
// 	1 2
// 	3 5 8
// 	13 21 34 55
// 	89 144 233 377 610
// 	
// 	
// 
public class Pattern45{
	public static void main(String[] args){
		int steps = 5 ;
		int prev = 0 ;
		int current = 1, temp ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= i ; j ++ ){
				System.out.print(current+" ");
				temp = current ;
				current += prev ;
				prev = temp ;
			}
			System.out.println();
		}
	}
}