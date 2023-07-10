// Program to demonstrate the concept of Wrapper Class in java - Byte Wrapper Class
public class Wrapper4{
	public static void main(String[] args){
		Byte bt = 12;
		Byte b1 = 2;
		Byte b2 = 3;
		byte bp = 1;
		
		// Byte Wrapper Class Methods
		// Constructors - deprecated
		Byte b = new Byte(bp);
		Byte b = new Byte("2");
		
		// Byte Class fields
		System.out.println("No of bytes used to represent a byte value (2's complement) is "+Byte.BYTES);
		System.out.println("No of bits used to represent a byte value (2's complement) is "+Byte.SIZE);
		System.out.println("MAX Byte value is "+Byte.MAX_VALUE);
		System.out.println("MIN Byte value is "+Byte.MIN_VALUE);
		System.out.println("Class type is "+Byte.TYPE);
		
		// Byte valueOf(byte b)
		System.out.println(Byte.valueOf(bp));
		
		// Byte valueOf(String s)
		System.out.println(Byte.valueOf("12"));
		
		// byte parseByte(String s)
		System.out.println(Byte.parseByte("53"));
		
		// String toString(byte b) - returns a string class object representing the specified byte object 
		System.out.println(Byte.toString(bt));
		
		// byte byteValue() - returns a string class object representing the specified byte object 
		System.out.println(bt.byteValue());
		
		// byte byteValue() - returns a byte value representing the specified byte object 
		System.out.println(bt.byteValue());
		
		// short shortValue() - returns a short value representing the specified byte object 
		System.out.println(bt.shortValue());
		
		// int intValue() - returns a int value representing the specified byte object 
		System.out.println(bt.intValue());
		
		// long longvalue() - returns a long value representing the specified byte object 
		System.out.println(bt.longValue());
		
		// double doublevalue() - returns a double value representing the specified byte object 
		System.out.println(bt.doubleValue());
		
		// float floatvalue() - returns a float value representing the specified byte object 
		System.out.println(bt.floatValue());
		
		// int compareTo(Byte b) - compares two byte objects numerically
		System.out.println(b1.compareTo(b2));
		
		// static int compare(byte x, byte y) - compares two primitive byte values numerically
		System.out.println(Byte.compare(b1, b2));
		
		// boolean equals(Object obj) - checks whether two objects are equal or not
		System.out.print(b1.equals(b2));
	} 
}