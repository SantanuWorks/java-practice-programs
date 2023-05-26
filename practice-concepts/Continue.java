// program to demonstrate the continue statement
public class Continue{
	public static void main(String[] args){
		// skip the statement for some conditions
		// skipping the prime numbers 
		for( int i = 1 ; i < 10 ; i ++){
			if( i == 1 || i == 2 || i == 3 || i == 5 || i == 7 ) continue;
			System.out.print(i+" ");
		}
	}
}