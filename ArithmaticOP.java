// Using various operators in java
// Arithmatic Operators in Java
public class ArithmaticOP{
	public static void main( String args[] ){
		int a = 20, b = 5;
		System.out.println(a + " + " + b + " = " + (a+b) ) ;
		System.out.println(a + " - " + b + " = " + (a-b) ) ;
		System.out.println(a + " * " + b + " = " + (a*b) ) ;
		System.out.println(a + " / " + b + " = " + (a/b) ) ;
		System.out.println(a + " % " + b + " = " + (a%b) ) ;
		
		System.out.println();
		
		float c = 0.2f, d = 0.5f;
		System.out.println(c + " + " + d + " = " + (c+d) ) ;
		System.out.println(c + " - " + d + " = " + (c-d) ) ;
		System.out.println(c + " * " + d + " = " + (c*d) ) ;
		System.out.println(c + " / " + d + " = " + (c/d) ) ;
		System.out.println(c + " % " + d + " = " + (c%d) ) ;
		
		System.out.println();
		
		char e = 'A', f = 'B';
		System.out.println(e + " + " + f + " = " + (e+f) ) ;
		System.out.println(e + " - " + f + " = " + (e-f) ) ;
		System.out.println(e + " * " + f + " = " + (e*f) ) ;
		System.out.println(e + " / " + f + " = " + (e/f) ) ;
		System.out.print(e + " % " + f + " = " + (e%f) ) ;
		
		// boolean g = true, h = false;
		// will generate error - booleans re not compatible with arithmatic operators
		// System.out.println(g + " + " + h + " = " + (g+h) ) ; 
	}
}