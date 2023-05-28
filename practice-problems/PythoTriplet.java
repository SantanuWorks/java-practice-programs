// Write a program to generate all Pythogorean Triplets with side length less than or equal to 30. 
public class PythoTriplet{
	public static void main(String[] args){
		for( int a = 1 ; a <= 30 ; a ++ )
			for( int b = 1 ; b <= 30 ; b ++ )
				for( int c = 1 ; c <= 30 ; c ++ )
					if( a*a + b*b == c*c ) System.out.println(a+" "+b+" "+c);
	}
}