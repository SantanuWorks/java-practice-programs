// program to print following pattern
// 
// *****			
// ****         
// ***         
// **        
// *        
// 
public class Pattern5{
	public static void main(String[] args){
		int step = 5 ;
		for( int i = 1 ; i <= step ; i++ ){
			for( int j = 0 ; j < step + 1 - i ; j ++ )
				System.out.print("*");
			System.out.println();
		}
	}
}