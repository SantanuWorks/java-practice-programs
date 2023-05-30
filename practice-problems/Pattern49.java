// program to print following pattern
//
// AAAAA
// BBBBB
// CCCCC
// DDDDD
// EEEEE
// 
public class Pattern49{
	public static void main(String[] args){
		int steps = 5 ;
		char val = 'A' ;
		for( int i = 1 ; i <= steps ; i ++ ){
			for( int j = 1 ; j <= steps ; j ++ ) System.out.print(val);
			System.out.println();
			val ++ ;
		}
	}
}