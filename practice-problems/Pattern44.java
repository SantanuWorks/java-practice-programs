// program to print following pattern
//
// 	1     1
// 	 2   2
// 	  3 3
// 	   4
// 	  3 3
// 	 2   2
// 	1     1
// 
public class Pattern44{
	public static void main(String[] args){
		int val = 1 ;
		int step = 9;
		int space = 2*(step - 1) ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j < i ; j ++ ) System.out.print(" ");
			if( i == step - 1 ) System.out.print(val++);
			else{
				System.out.print(val);
				for( int j = 1 ; j < space ; j ++ ) System.out.print(" ");
				System.out.print(val);
				space -= 2 ;
				val++;
			}
			System.out.println();
		}
		step--;
		space = 1 ;
		val = step ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j < step - 1 - i ; j ++ ) System.out.print(" ");
			System.out.print(val);
			for( int j = 0 ; j < space ; j ++ ) System.out.print(" ");
			System.out.print(val);
			System.out.println();
			space += 2;
			val -- ;
		}
	}
}