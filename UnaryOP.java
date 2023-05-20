// Using various operators in java
// Unary Operators in Javas
public class UnaryOP{
	public static void main( String args[] ){
		int a = 20, b = -12 ;
		System.out.println("+(" + a + ") = " + (+a) + ", +(" + b + ") = " + (+b) ) ;
		System.out.println("-(" + a + ") = " + (-a) + ", -(" + b + ") = " + (-b) ) ;
		System.out.println("++(" + a + ") = " + (++a) + ", ++(" + b + ") = " + (++b) ) ;
		System.out.println("--(" + a + ") = " + (--a) + ", --(" + b + ") = " + (--b) ) ;
		System.out.println("(" + a + ")++ = " + (a++) + ", (" + b + ")++ = " + (b++) ) ;
		System.out.println("(" + a + ")-- = " + (a--) + ", (" + b + ")-- = " + (b--) ) ;
		
		// logical not ! only works on boolean type
		// System.out.println("!(" + a + ") = " + (!a) + ", !(" + b + ") = " + (!b) ) ; 
		
		System.out.println();
		
		float c = 0.2f, d = 3.5f ;
		System.out.println("+(" + c + ") = " + (+c) + ", +(" + d + ") = " + (+d) ) ;
		System.out.println("-(" + c + ") = " + (-c) + ", -(" + d + ") = " + (-d) ) ;
		System.out.println("++(" + c + ") = " + (++c) + ", ++(" + d + ") = " + (++d) ) ;
		System.out.println("--(" + c + ") = " + (--c) + ", --(" + d + ") = " + (--d) ) ;
		System.out.println("(" + c + ")++ = " + (c++) + ", (" + d + ")++ = " + (d++) ) ;
		System.out.println("(" + c + ")-- = " + (c--) + ", (" + d + ")-- = " + (d--) ) ;
		
		
		System.out.println();
		
		char e = 'A', f = 'B';
		System.out.println("+(" + e + ") = " + (+e) + ", +(" + f + ") = " + (+f) ) ;
		System.out.println("-(" + e + ") = " + (-e) + ", -(" + f + ") = " + (-f) ) ;
		System.out.println("++(" + e + ") = " + (++e) + ", ++(" + f + ") = " + (++f) ) ;
		System.out.println("--(" + e + ") = " + (--e) + ", --(" + f + ") = " + (--f) ) ;
		System.out.println("(" + e + ")++ = " + (e++) + ", (" + f + ")++ = " + (f++) ) ;
		System.out.println("(" + e + ")-- = " + (e--) + ", (" + f + ")-- = " + (f--) ) ;
		
		System.out.println();
		
		// logical not ! only works on boolean type
		boolean g = true, h = false;
		System.out.print("!(" + g + ") = " + (!g) + ", !(" + h + ") = " + (!h) ) ;
		
	}
};