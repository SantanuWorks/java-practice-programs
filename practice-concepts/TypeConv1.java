// Program to demonstrate type conversion in java - type conversion
public class TypeConv1{
	public static void main(String[] args){
		// Data of lower type is converted into higher type by the compiler
		short a = 12;
		int b;
		long c;
		b = a; // This is done by the compiler automatically
		c = b; 
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.print("c = "+c);
	} 
}