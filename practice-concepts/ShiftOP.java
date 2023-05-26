// Using various operators in java
// Shift Operators in Javas
public class ShiftOP{
	public static void main( String args[] ){
		int a = 4, b = 2 ;
		System.out.println(a + " << " + b + " = " + (a<<b) ) ; // 4 * 2^2 = 16
		System.out.println(a + " >> " + b + " = " + (a>>b) ) ; // 4 / 2^2 == 1
		System.out.println(a + " >>> " + b + " = " + (a>>>b) ) ;
		
		System.out.println();
		
		char c = 'A', d = 'B' ;
		System.out.println(c + " << " + d + " = " + (c<<d) ) ; // 4 * 2^2 = 16
		System.out.println(c + " >> " + d + " = " + (c>>d) ) ; // 4 / 2^2 == 1
		System.out.println(c + " >>> " + d + " = " + (c>>>d) ) ;
		
		System.out.println();
		
		// works on integers only 
		// float e = 2.0f, f = 1.0f ;
		// System.out.println(e + " << " + f + " = " + (e<<f) ) ; /
		
		// works on integers only 
		// boolean g = true, h = false ;
		// System.out.println(g + " << " + h + " = " + (g<<h) ) ; /
		
	}
};