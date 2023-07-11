// Program to demonstrate the concept of Wrapper Class in java - Unboxing
public class Wrapper12{
	public static void main(String[] args){
		// Conversion of wrapper class object into primitive type is called unboxing
		int i; // Primitive type variable
		Integer I = Integer.valueOf(12); // Integer wrapper class object
		i = I; // Storing the primitive value present in the object to primitive variable
		System.out.println("Integer Object , I = "+I);
		System.out.println("Primitive int constant, i = "+i);
		Integer J = 13;
		// Wrspper class object can be directly used in expression
		// Internally they will automatically converted into primitive values
		// This is known as unboxing 
		Integer K = I + J; 
		System.out.println("I = "+I+", J = "+J+", I + J = "+K);
		// Compare - for any kind of expression unboxing happen internally
		if( I == i ) System.out.print("Both are equal");
		else System.out.print("Both are not equal");
	} 
}