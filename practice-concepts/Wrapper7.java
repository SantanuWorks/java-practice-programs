// Program to demonstrate the concept of Wrapper Class in java - Long Wrapper Class
public class Wrapper7{
	public static void main(String[] args){
		Long st = 12L;
		Long s1 = 2L;
		Long s2 = 3L;
		long sp = 1;
		
		// Long Wrapper Class Methods
		// Constructors - deprecated
		Long s = new Long(sp);
		Long s = new Long("2");
		
		// Long Class fields
		System.out.println("No of bytes used to represent a long value (2's complement) is "+Long.BYTES);
		System.out.println("No of bits used to represent a long value (2's complement) is "+Long.SIZE);
		System.out.println("MAX long value is "+Long.MAX_VALUE);
		System.out.println("MIN long value is "+Long.MIN_VALUE);
		System.out.println("Class type is "+Long.TYPE);
		
		// Long valueOf(long b)
		System.out.println(Long.valueOf(sp));
		
		// Long valueOf(String s)
		System.out.println(Long.valueOf("12"));
		
		// long parseLong(String s)
		System.out.println(Long.parseLong("53"));
		
		// String toString(long i) - returns a string class object representing the specified long object 
		System.out.println(Long.toString(st));
		
		// String toHexString(long b) - returns the string corresponding to the long value in hexadecimal form
		System.out.println(Long.toHexString(st));
		
		// String toOctalString(long b)) - returns the string corresponding to the long value in octal form 
		System.out.println(Long.toOctalString(st));
		
		// String toBinaryString(long b) - returns the string corresponding to the long value in binary form
		System.out.println(Long.toBinaryString(st));
		
		// byte byteValue() - returns a byte value representing the specified long object 
		System.out.println(st.byteValue());
		
		// long shortValue() - returns a short value representing the specified long object 
		System.out.println(st.shortValue());
		
		// long intValue() - returns a int value representing the specified long object 
		System.out.println(st.intValue());
		
		// long longvalue() - returns a long value representing the specified long object 
		System.out.println(st.longValue());
		
		// double doublevalue() - returns a double value representing the specified long object 
		System.out.println(st.doubleValue());
		
		// float floatvalue() - returns a float value representing the specified long object 
		System.out.println(st.floatValue());
		
		// int compareTo(Long s) - compares two long objects numerically
		System.out.println(s1.compareTo(s2));
		
		// static int compare(long x, long y) - compares two primitive long values numerically
		System.out.println(Long.compare(s1, s2));
		
		// boolean equals(Object obj) - checks whether two objects are equal or not
		System.out.println(s1.equals(s2));
		
		// long max(long a, long b) - finds the max of two longs
		System.out.println(Long.max(1,3));
		
		// long min(long a, long b) - finds the min of two longs
		System.out.println(Long.min(1,3));
		
		// int signum(long b) - returns -1 for negative values, 0 for 0 and +1 for values greater than 0. 
		System.out.print(Long.signum(8));
	} 
}