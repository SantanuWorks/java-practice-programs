// program to print following pattern
//
// E       E 
//  D     D
//   C   C
//    B B
//     A  	
// 
public class Pattern67{
	public static void main(String[] args){
		int step = 5;
		int space = 2*(step - 1) ;
		char val = 'A' - 1 ;
		val += step ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j < i ; j ++ ) System.out.print(" ");
			if( i == step - 1 ) System.out.print(val);
			else{
				System.out.print(val);
				for( int j = 1 ; j < space ; j ++ ) System.out.print(" ");
				System.out.print(val);
				space -= 2 ;
			}
			System.out.println();
			val--;
		}
	}
}