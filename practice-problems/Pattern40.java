// program to print following pattern
//
// 	5       5
// 	 4     4
// 	  3   3
// 	   2 2
// 	    1
// 	
// 	
// 
public class Pattern40{
	public static void main(String[] args){
		int step = 5;
		int space = 2*(step - 1) ;
		int val = step ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j < i ; j ++ ) System.out.print(" ");
			if( i == step - 1 ) System.out.print(val--);
			else{
				System.out.print(val);
				for( int j = 1 ; j < space ; j ++ ) System.out.print(" ");
				System.out.print(val);
				space -= 2 ;
				val--;
			}
			System.out.println();
		}
	}
}