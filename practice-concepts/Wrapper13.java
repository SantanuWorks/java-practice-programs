// Program to demonstrate the concept of Wrapper Class in java - Unboxing
public class Wrapper13{
	// Method adds two Integer object
	// Autoboxing will happen when primitve values are passed to this method
	public static Integer objSum(Integer a, Integer b){
		Integer c = a + b;
		return c;
	}
	// Method adds two primitve int contant
	// Unboxing will happen when objects are passed to this method
	public static int primSum(int a, int b){
		int c = a + b;
		return c;
	}
	public static void main(String[] args){
		int a1 = 13;
		int b1 = 12;
		// Unboxing will happen for returned value
		int s1 = objSum(a1,b1);
		System.out.println("a1 = "+a1+", b1 = "+b1+", a1 + b1 = "+s1);
		
		Integer a2 = Integer.valueOf(12);
		Integer b2 = Integer.valueOf(13);
		// Autoboxing will happen for returned value
		Integer s2 = primSum(a2,b2);
		System.out.print("a2 = "+a2+", b2 = "+b2+", a2 + b2 = "+s2);
	}
}