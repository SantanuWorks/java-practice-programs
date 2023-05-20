// Using various operators in java
// Bitwise Operators in Javas
public class BitOP{
	public static void main( String args[] ){
		int a = 4, b = 2;
		System.out.println(a + " & " + b + " = " + (a&b) ) ; // 100 & 010 = 000 ( 0 )
		System.out.println(a + " | " + b + " = " + (a|b) ) ; 
		System.out.println(a + " ^ " + b + " = " + (a^b) ) ; // 100 ^ 010 = 110 ( 6 )
		System.out.println("~" + a + " = " + ~a ) ; // ~100 = 011
		System.out.println("~(" + -a + ") = " + ~(-a) ) ; 

		// bitwise operators only works on interger types
		// float c = 0.2f, d = 0.5f;
		// System.out.println(c + " & " + d + " = " + (c&d) ) ;
		
		System.out.println();
		
		// charcters are form of interger, it will work
		char e = 'A', f = 'B';
		System.out.println(e + " & " + f + " = " + (e&f) ) ;
		System.out.println(e + " | " + f + " = " + (e|f) ) ;
		System.out.println(e + " ^ " + f + " = " + (e^f) ) ;
		System.out.println("~" + e + " = " + ~e ) ; 
		
		// works on binary bits things 
		boolean c = true, d = false ;
		System.out.println(c + " & " + d + " = " + (c&d) ) ;
		System.out.println(c + " | " + d + " = " + (c|d) ) ;
		System.out.println(c + " ^ " + d + " = " + (c^d) ) ;
		
		// will not work / use logical not instead
		// System.out.println("~" + c + " = " + ~(c) ) ;
		// System.out.println("~" + d + " = " + ~d ) ;	
	}
};