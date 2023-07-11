// Program to demonstrate type conversion in java - miscellaneous
public class TypeConv3{
	public static void main(String[] args){
		// While evaluating an expression, result may exceed the operand range
		// In this case compiler automatically promotes the type of the result to higher type automatically
		byte a = 126;
		short b = 32000;
		int c;
		c = a*b;
		
		// Expression having short, byte will promote to int
		System.out.println("Byte type, a = "+a);
		System.out.println("Short type, b = "+b);
		System.out.println("Promoted to Int type, c = "+c);
		
		// Expression having long, float or double will promote to one of them
		float d = 1.3f;
		// Expression will be promoted to float
		float e = a*b*c*d;
		System.out.println("Byte type, a = "+a);
		System.out.println("Short type, b = "+b);
		System.out.println("Int type, c = "+c);
		System.out.println("Float type, d = "+d);
		System.out.println("Promoted to Float type, e = "+e);
		
		// If the variable has the lower type than the promoted type 
		// We can use type casting there
		int f = (int)(a*b*c*d);
		System.out.println("Promoted to Float type and casted to int, f = "+f);
	
		// When higer data is stored lower range variable then original data is truncted 
		// formula is NEW_VALUE = OG_VALUE%RANGE
		// works like above if value to be stored is out of the range
		byte p; // range is -128 to 127 i.e. 256
		int q = 293; // out of range value for the byte type
		p = (byte)q; // p = q%256
		System.out.println("Original value, q = "+q);
		System.out.print("Narrowed value, p = "+p);
	} 
}