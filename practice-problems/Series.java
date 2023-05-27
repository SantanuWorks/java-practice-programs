// Write a program to add first seven terms of the following series
// 1/1! + 2/2! + 3/3! + ...
public class Series{
	public static void main(String[] args){
		float ans = 1.0f ;
		int f = 1 ;
		for( int i = 1 ; i < 7 ; i++ ){
			for( int j = 1 ; j <= i ; j++ ) f *= j ;
			ans += ( 1.0f / f );
			f = 1;
		}
		System.out.print("Sum of seven terms is "+ans);
	}
}