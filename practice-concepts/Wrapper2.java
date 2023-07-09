// Program to demonstrate the concept of Wrapper Class in java - way to create instance of java
public class Wrapper2{
	public static void main(String[] args){
		// Constructor method is deprecated
		// Integer a = new Integer(1);
		
		// Using valueOf() method
		Integer b = Integer.valueOf(2);
		System.out.println("Integer Object, b = "+b);
		
		// Using autobixing
		// Internally it uses valueOf()
		Integer c = 3;
		System.out.println("Integer Object, c = "+c);
		 
		// All the objects created using above two method with same value point to same memory location
		Integer p = Integer.valueOf(4);
		Integer q = 4;
		Integer r = 5;
		System.out.println("Objects with same value are equal, "+(p==q));
		System.out.print("Objects with different value are unequal, "+(p==r));
	} 
}