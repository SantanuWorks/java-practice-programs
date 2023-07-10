// Program to demonstrate the concept of Wrapper Class in java - Double Wrapper Class
public class Wrapper9{
	public static void main(String[] args){
		Double st = 1.2;
		Double s1 = 2.3;
		Double s2 = 3.4;
		double sp = 1.0;
		
		// Double Wrapper Class Methods
		// Constructors - deprecated
		Double s = new Double(sp);
		Double s = new Double("2.4");
		
		// Double Class fields
		System.out.println("No of bytes used to represent a double value (2's complement) is "+Double.BYTES);
		System.out.println("No of bits used to represent a double value (2's complement) is "+Double.SIZE);
		System.out.println("MAX double value is "+Double.MAX_VALUE);
		System.out.println("MIN double value is "+Double.MIN_VALUE);
		System.out.println("Class type is "+Double.TYPE);
		
		// Double valueOf(double b)
		System.out.println(Double.valueOf(sp));
		
		// Double valueOf(String s)
		System.out.println(Double.valueOf("12.99"));
		
		// double parseDouble(String s)
		System.out.println(Double.parseDouble("53.99"));
		
		// String toString(double i) - returns a string class object representing the specified double object 
		System.out.println(Double.toString(st));
		
		// String toHexString(double b) - returns the string corresponding to the double value in hexadecimal form
		System.out.println(Double.toHexString(st));
		
		// byte byteValue() - returns a byte value representing the specified double object 
		System.out.println(st.byteValue());
		
		// short shortValue() - returns a short value representing the specified double object 
		System.out.println(st.shortValue());
		
		// int intValue() - returns a int value representing the specified double object 
		System.out.println(st.intValue());
		
		// long longvalue() - returns a long value representing the specified double object 
		System.out.println(st.longValue());
		
		// double doublevalue() - returns a double value representing the specified double object 
		System.out.println(st.doubleValue());
		
		// float floatvalue() - returns a float value representing the specified double object 
		System.out.println(st.floatValue());
		
		// int compareTo(Double s) - compares two double objects numerically
		System.out.println(s1.compareTo(s2));
		
		// int compare(double x, double y) - compares two primitive double values numerically
		System.out.println(Double.compare(s1, s2));
		
		// boolean equals(Object obj) - checks whether two objects are equal or not
		System.out.println(s1.equals(s2));
		
		// double max(double a, double b) - finds the max of two float
		System.out.println(Double.max(1.2,3.4));
		
		// double min(double a, double b) - finds the min of two float
		System.out.println(Double.min(1.2,3.4));
		
		// int boolean isNaN() - returns true if the double object in consideration is not a number, otherwise false. 
		System.out.println(Double.isNaN(8.32));
		
		// boolean isInfinite(double b): returns true if the double object in consideration is very large,
		System.out.print(Double.isInfinite(882083423.234832848));
	} 
}