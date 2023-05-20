// Using various operators in java
// Logical Operators in Javas
public class LogicalOP{
	public static void main( String args[] ){
		
		// logical operators only work on binary operands/values
		
		System.out.println(true + " && " + true + " = " + (true&&true) ) ;
		System.out.println(true + " && " + false + " = " + (true&&false) ) ;
		System.out.println(false + " && " + true + " = " + (false&&true) ) ;
		System.out.println(false + " && " + false + " = " + (false&&false) ) ;
		
		System.out.println();
		
		System.out.println(true + " || " + true + " = " + (true||true) ) ;
		System.out.println(true + " || " + false + " = " + (true||false) ) ;
		System.out.println(false + " || " + true + " = " + (false||true) ) ;
		System.out.println(false + " || " + false + " = " + (false||false) ) ;
		
		System.out.println();
		
		// logical not ! only works on boolean type
		boolean g = true, h = false;
		System.out.print("!(" + g + ") = " + (!g) + ", !(" + h + ") = " + (!h) ) ;
	}
};