// show the use of data types
public class DTypeUse{
	public static void main( String[] args ){
		boolean a = true ; // supports truth values true/false only 
		byte b = 12 ; // type of int with 1 byte of capacity 
		short c = 134 ; // type of int with 2 byte of capacity 
		char d = 'A' ; // supports unicode characters of 2 byte 
		int e = 77778 ; // type of int with 4 byte of capacity
		long f = 333333333 ; // type of int with 8 byte of capacity
		float g = 324.3232f ; // it's a fraction type of 4 byte capacity 
		double h = 23232.2322323 ; // it's a fraction type of 8 byte capacity
		
		System.out.println("Type \tSize\tRange\t\tDefault\te.g.");
		System.out.println("boolean\t1 bit\ttrue/false\tfalse\t"+a);
		System.out.println("byte \t1 Byte\t-128 to 127\t0\t"+b);
		System.out.println("short \t2 Byte\t-32768 to 32767\t0\t"+c);
		System.out.println("char \t2 Byte\t0 to 255\t\\u000\t"+d);
		System.out.println("int \t4 Byte\t - \t\t0\t"+e);
		System.out.println("long \t8 Byte\t - \t\t0\t"+f);
		System.out.println("float \t4 Byte\t7 decimals\t0.0\t"+g);
		System.out.println("double \t8 Byte\t16 decimals\t0.0\t"+h);
	}
}