// program to print following pattern
//
// 	54321
// 	54321
// 	54321
// 	54321
// 	54321
// 
public class Pattern27{
	public static void main(String[] args){
		int steps = 5 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps ; j ++ ) System.out.print(steps-j+1);
			System.out.println();
		}
	}
}