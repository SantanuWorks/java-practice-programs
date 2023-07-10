// Program to demonstrate the concept of Wrapper Class in java - Float Wrapper Class
public class Wrapper8{
	public static void main(String[] args){
		Float st = 1.2f;
		Float s1 = 2.3f;
		Float s2 = 3.4f;
		float sp = 1.0f;
		
		// Float Wrapper Class Methods
		// Constructors - deprecated
		Float s = new Float(sp);
		Float s = new Float("2.3");
		
		// Float Class fields
		System.out.println("No of bytes used to represent a float value (2's complement) is "+Float.BYTES);
		System.out.println("No of bits used to represent a float value (2's complement) is "+Float.SIZE);
		System.out.println("MAX float value is "+Float.MAX_VALUE);
		System.out.println("MIN float value is "+Float.MIN_VALUE);
		System.out.println("Class type is "+Float.TYPE);
		
		// Float valueOf(float b)
		System.out.println(Float.valueOf(sp));
		
		// Float valueOf(String s)
		System.out.println(Float.valueOf("12.99"));
		
		// float parseFloat(String s)
		System.out.println(Float.parseFloat("53.99"));
		
		// String toString(float i) - returns a string class object representing the specified float object 
		System.out.println(Float.toString(st));
		
		// String toHexString(float b) - returns the string corresponding to the float value in hexadecimal form
		System.out.println(Float.toHexString(st));
		
		// byte byteValue() - returns a byte value representing the specified float object 
		System.out.println(st.byteValue());
		
		// short shortValue() - returns a short value representing the specified float object 
		System.out.println(st.shortValue());
		
		// int intValue() - returns a int value representing the specified float object 
		System.out.println(st.intValue());
		
		// long longvalue() - returns a long value representing the specified float object 
		System.out.println(st.longValue());
		
		// double doublevalue() - returns a double value representing the specified float object 
		System.out.println(st.doubleValue());
		
		// float floatvalue() - returns a float value representing the specified float object 
		System.out.println(st.floatValue());
		
		// int compareTo(Float s) - compares two float objects numerically
		System.out.println(s1.compareTo(s2));
		
		// static int compare(float x, float y) - compares two primitive float values numerically
		System.out.println(Float.compare(s1, s2));
		
		// boolean equals(Object obj) - checks whether two objects are equal or not
		System.out.println(s1.equals(s2));
		
		// float max(float a, float b) - finds the max of two float
		System.out.println(Float.max(1.2f,3.4f));
		
		// float min(float a, float b) - finds the min of two float
		System.out.println(Float.min(1.2f,3.4f));
		
		// int boolean isNaN() - returns true if the float object in consideration is not a number, otherwise false. 
		System.out.println(Float.isNaN(8.32f));
		
		// boolean isInfinite(float b): returns true if the float object in consideration is very large,
		System.out.print(Float.isInfinite(882083423.234832848f));
	} 
}