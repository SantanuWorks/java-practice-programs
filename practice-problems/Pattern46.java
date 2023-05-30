// program to print following pattern
//
// 1     7
// 12   67
// 123 567
// 1234567
// 123 567
// 12   67
// 1     7
// 
public class Pattern46{
	public static void main(String[] args){
		int step = 4 ;
		int val = 1 ;
		for( int j = 0 ; j < step - 1 ; j ++ ){
			for( int i = 0 ; i <= j ; i ++, val++ ) System.out.print(val);
			for( int i = 1 ; i < (step - 1 - j)*2 ; i ++, val++  ) System.out.print(" ");
			for( int i = 0 ; i <= j ; i ++, val++ ) System.out.print(val);
			System.out.println();
			val = 1 ;
		}
		for( int i = 0 ; i < step*2 - 1; i ++, val++ ) System.out.print(val);
		System.out.println();
		step-- ;
		val = 1 ;
		for( int j = 0 ; j < step ; j ++ ){
			for( int i = 0 ; i < step - j ; i ++, val++ ) System.out.print(val);
			for( int i = 0 ; i < j*2 + 1 ; i ++, val++ ) System.out.print(" ");
			for( int i = 0 ; i < step - j ; i ++, val++ ) System.out.print(val);
			System.out.println();
			val = 1 ;
		}
	}
}