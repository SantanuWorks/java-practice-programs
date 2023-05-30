// program to print following pattern
//
// E D C B A 
// E D C B
// E D C
// E D
// E	
// 
public class Pattern58{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A' - 1;
		val += steps ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps - i + 1 ; j ++, val-- ) System.out.print(val+" ");
			System.out.println();
			val = 'A' - 1;
		    val += steps ;
		}
	}
}