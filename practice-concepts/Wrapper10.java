// Program to demonstrate the concept of Wrapper Class in java - Boolean Wrapper Class
public class Wrapper10{
	public static void main(String[] args){
		Boolean a = true;
		Boolean b = false;
		boolean c = false;
		
		// Boolean Wrapper Class Methods
		// Constructors - deprecated
		Boolean s = new Boolean(true);
		Boolean s = new Boolean("false");
		
		// Boolean Class fields
		System.out.println("TRUE has "+Boolean.TRUE);
		System.out.println("FALSE has "+Boolean.FALSE);
		System.out.println("Class type is "+Boolean.TYPE);
		
		// Double valueOf(boolean b)
		System.out.println(Boolean.valueOf(c));
		
		// Double valueOf(String s)
		System.out.println(Boolean.valueOf("true"));
		
		// double parseDouble(String s)
		System.out.println(Boolean.parseBoolean("false"));
		
		// String toString(boolean b) - returns a string class object representing the specified boolean object 
		System.out.println(Boolean.toString(c));
		
		// String toString() - returns a string class object representing the specified boolean object 
		System.out.println(a.toString());
		
		// boolean booleanValue() - returns a boolean value representing the specified boolean object 
		System.out.println(a.booleanValue());
		
		// int compareTo(boolean b) - compares two boolean objects 
		System.out.println(a.compareTo(b));
		
		// int compare(boolean x, boolean y) - compares two primitive boolean values numerically
		System.out.println(Boolean.compare(a, b));
		
		// boolean equals(Object obj) - checks whether two objects are equal or not
		System.out.print(a.equals(b));
	} 
}