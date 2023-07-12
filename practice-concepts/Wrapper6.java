// Program to demonstrate the concept of Wrapper Class in java - Integer Wrapper Class
public class Wrapper6{
	public static void main(String[] args){
		Integer st = 12;
		Integer s1 = 2;
		Integer s2 = 3;
		int sp = 1;
		
		// Integer Wrapper Class Methods
		// Constructors - deprecated
		Integer s = new Integer(sp);
		Integer s = new Integer("2");
		
		// Integer Class fields
		System.out.println("No of bytes used to represent a int value (2's complement) is "+Integer.BYTES);
		System.out.println("No of bits used to represent a int value (2's complement) is "+Integer.SIZE);
		System.out.println("MAX int value is "+Integer.MAX_VALUE);
		System.out.println("MIN int value is "+Integer.MIN_VALUE);
		System.out.println("Class type is "+Integer.TYPE);
		
		// Common Methods
		// Integer valueOf(int b)
		System.out.println(Integer.valueOf(sp));
		
		// Integer valueOf(String s)
		System.out.println(Integer.valueOf("12"));
		
		// String toString(int i) - returns a string class object representing the specified int object 
		System.out.println(Integer.toString(st));
		
		// String toString() - returns a string class object representing the specified int object 
		System.out.println(st.toString());
		
		// byte byteValue() - returns a byte value representing the specified int object 
		System.out.println(st.byteValue());
		
		// int shortValue() - returns a short value representing the specified int object 
		System.out.println(st.shortValue());
		
		// int intValue() - returns a int value representing the specified int object 
		System.out.println(st.intValue());
		
		// long longvalue() - returns a long value representing the specified int object 
		System.out.println(st.longValue());
		
		// double doublevalue() - returns a double value representing the specified int object 
		System.out.println(st.doubleValue());
		
		// float floatvalue() - returns a float value representing the specified int object 
		System.out.println(st.floatValue());
		
		// int compareTo(Integer s) - compares two int objects numerically
		System.out.println(s1.compareTo(s2));
		
		// static int compare(int x, int y) - compares two primitive int values numerically
		System.out.println(Integer.compare(s1, s2));
		
		// boolean equals(Object obj) - checks whether two objects are equal or not
		System.out.println(s1.equals(s2));
		
		// Additional Values
		// int parseInt(String s)
		System.out.println(Integer.parseInt("53"));
		
		// int max(int a, int b) - finds the max of two integers
		System.out.println(Integer.max(1,3));
		
		// int min(int a, int b) - finds the min of two integers
		System.out.println(Integer.min(1,3));
		
		// int signum(int b) - returns -1 for negative values, 0 for 0 and +1 for values greater than 0. 
		System.out.print(Integer.signum(8));
		
		// String toHexString(int b) - returns the string corresponding to the int value in hexadecimal form
		System.out.println(Integer.toHexString(st));
		
		// String toOctalString(int b)) - returns the string corresponding to the int value in octal form 
		System.out.println(Integer.toOctalString(st));
		
		// String toBinaryString(int b) - returns the string corresponding to the int value in binary form
		System.out.println(Integer.toBinaryString(st));
	} 
}