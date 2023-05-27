// Find all the prime numbers between 1 and 300
public class Primes{
	public static void main(String[] args){
		int n ; 
		byte c = 0 ;
		System.out.print("Prime numbers between 1 and 300 are ");
		for( int i = 2 ; i < 300 ; i ++ ){
			n = i ;
			for( int j = 2 ; j < n ; j ++ ) if( n % j == 0 ) { c++; break; }
			if( c > 0 ){ c = 0; continue; }
			else System.out.print(n+" ");
			c = 0 ;
		}
	}
}