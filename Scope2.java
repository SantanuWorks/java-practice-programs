// variable scole inside loop and outside loop
public class Scope2{
	public static void main( String args[] ){
		int i; // variable name defined outside should not be defined inside the for loop
		// following line will produce error
		for( int i = 0 ; i < 4 ; i ++ ) {}
		
		// variable defined inside the loop can be defined after the loop
		for( int j = 1 ; j < 5 ; j ++ ) {} // this won't produce error
		int j ;
	}
}