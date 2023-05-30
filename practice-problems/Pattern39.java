// program to print following pattern
//
// 	   1
//    2 2
//   3   3
// 	4     4
// 5	   5
// 
public class Pattern39{
	public static void main(String[] args){
		int step = 5;
		int space = 1 ;
		int val = 1 ;
		for( int i = 0 ; i < step ; i ++ ){
			for( int j = 0 ; j < step - 1 - i ; j ++ ) System.out.print(" ");
			if( i == 0 ) System.out.print(val++);
			else{
				System.out.print(val);
				for( int j = 0 ; j < space ; j ++ ) System.out.print(" ");
				System.out.print(val);
				space += 2 ;
				val++;
			}
			System.out.println();
		}
	}
}