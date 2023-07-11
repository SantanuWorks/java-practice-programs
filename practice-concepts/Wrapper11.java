// Program to demonstrate the concept of Wrapper Class in java - Autoboxing
public class Wrapper11{
	public static void main(String[] args){
		// Conversion of primitive type into Wrapper class object is called autoboxing
		int i = 12; // Primitive value
		Integer I; // Integer wrapper class object
		I = i; // Initializing the object with primitive value
		System.out.println("Primitive int constant, i = "+i);
		System.out.println("Integer Object , I = "+I);
		Integer J = 13;
		// Wrspper class object can be directly used in expression
		// Internally they will automatically converted into primitive values
		Integer K = I + J; 
		System.out.println("I = "+I+", J = "+J+", I + J = "+K);
		// Compare
		if( I == i ) System.out.print("Both are equal");
		else System.out.print("Both are not equal");
	} 
}