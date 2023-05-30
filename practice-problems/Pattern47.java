// program to print following pattern
//
// 1    
// 22   
// 3 3  
// 4  4
// 55555
// 	
// 
public class Pattern47{
	public static void main(String[] args){
		int step = 9 ;
		int val = 1 ;
		step -= 2 ;
		System.out.print(val);
		System.out.println();
		for( int i = 0 ; i < step ; i ++ ){
			val ++;
			System.out.print(val);
			for( int j = 0 ; j < i ; j ++ ) System.out.print(" ");
			System.out.print(val);
			System.out.println();
		}
		val ++;
		for( int i = 0 ; i < step + 2 ; i ++ ) System.out.print(val);
	}
}