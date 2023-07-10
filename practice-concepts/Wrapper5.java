// Program to demonstrate the concept of Wrapper Class in java - Short Wrapper Class
public class Wrapper5{
	public static void main(String[] args){
		Short st = 12;
		Short s1 = 2;
		Short s2 = 3;
		short sp = 1;
		// Short Wrapper Class Methods
		// Constructors
		// Short s = new Short(sp);
		// Short s = new Short("2");
		
		// Short Class fields
		System.out.println("No of bytes used to represent a short value (2's complement) is "+Short.BYTES);
		System.out.println("No of bits used to represent a short value (2's complement) is "+Short.SIZE);
		System.out.println("MAX short value is "+Short.MAX_VALUE);
		System.out.println("MIN short value is "+Short.MIN_VALUE);
		System.out.println("Class type is "+Short.TYPE);
		
		// Short valueOf(short b)
		System.out.println(Short.valueOf(sp));
		
		// Short valueOf(String s)
		System.out.println(Short.valueOf("12"));
		
		// short parseShort(String s)
		System.out.println(Short.parseShort("53"));
		
		// String toString(Short s) - returns a string class object representing the specified short object 
		System.out.println(Short.toString(st));
		
		// byte byteValue() - returns a byte value representing the specified short object 
		System.out.println(st.byteValue());
		
		// short shortValue() - returns a short value representing the specified short object 
		System.out.println(st.shortValue());
		
		// int intValue() - returns a int value representing the specified short object 
		System.out.println(st.intValue());
		
		// long longvalue() - returns a long value representing the specified short object 
		System.out.println(st.longValue());
		
		// double doublevalue() - returns a double value representing the specified short object 
		System.out.println(st.doubleValue());
		
		// float floatvalue() - returns a float value representing the specified short object 
		System.out.println(st.floatValue());
		
		// int compareTo(Short s) - compares two short objects numerically
		System.out.println(s1.compareTo(s2));
		
		// static int compare(short x, short y) - compares two primitive short values numerically
		System.out.println(Short.compare(s1, s2));
		
		// boolean equals(Object obj) - checks whether two objects are equal or not
		System.out.print(s1.equals(s2));
	} 
}