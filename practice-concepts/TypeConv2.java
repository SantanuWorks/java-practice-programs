// Program to demonstrate type conversion in java - type casting
public class TypeConv2{
	public static void main(String[] args){
		// Data of higher type is converted into lower type by the programmer
		short a;
		int b = 123;
		char c;
		a = (short)b; // casting syntax is mandatory; otherwise it will produce error
		c = (char)a;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.print("c = "+c);
	} 
}