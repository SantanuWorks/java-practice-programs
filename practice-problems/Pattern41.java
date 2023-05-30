// program to print following pattern
//
// 	5
//  54
// 	543
// 	5432
// 	54321
// 	543210
// 	54321
// 	5432
// 	543
// 	54
// 	5
// 
public class Pattern41{
	public static void main(String[] args){
		int steps = 6 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= i ; j ++ ) System.out.print(steps - j);
			System.out.println();
		}
		steps--;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i + 1 ; j ++ ) System.out.print(steps - j + 1);
			System.out.println();
		}
	}
}