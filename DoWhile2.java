// program to demonstrate the do while loop
public class DoWhile2{
	public static void main(String[] args){
		// infinite loop
		int i = 0 ;
		do{
			System.out.print(i+" ");
			i ++ ;
		}while( i > 0 );
		// we can skip the {} for a single line like in other blocks 
		// will not produce error
		do System.out.print("It is possible!"); while( false );
		do i++; while( i < 4 );
		System.out.print(i);
	}
}