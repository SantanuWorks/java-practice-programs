// program to print following pattern
//
// F
// FE
// FED
// FEDC
// FEDCB
// FEDCBA
// FEDCB
// FEDC
// FED
// FE
// F	
// 
public class Pattern64{
	public static void main(String[] args){
		int steps = 6 ;
		char val = 'A' - 1 ;
		val += steps ;
		char val2 ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= i ; j ++, val-- ) System.out.print(val);
			System.out.println();
			val = 'A' - 1 ;
			val += steps ;
		}
		steps--;
		val2 = val ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i + 1 ; j ++, val-- ) System.out.print(val);
			System.out.println();
			val = val2 ;
		}
	}
}