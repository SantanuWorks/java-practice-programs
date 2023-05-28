// program to print following pattern
//
// 					1
//                2   3
//              4   5   6
//            7   8   9   10
// 
public class Pattern1{
	public static void main(String[] args){
		int steps = 5 ;
		int val = 1 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 0 ; j < steps - i ; j ++ ) System.out.print(" ");
			for( int j = 0 ; j < i ; j ++,val++ ) System.out.print(val+" ");
			System.out.println();
		}
	}
}