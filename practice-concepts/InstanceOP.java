// Using various operators in java
// Instanceof Operators in Javas
class A{
};
public class InstanceOP extends A{
	public static void main( String args[] ){
		// works on a pair of object and class, to check wheather that object belongs to the class or not		
		// object declaration in java
		InstanceOP iop = new InstanceOP();
		A aob = new A();
		A aob2 = new InstanceOP();
		System.out.println(iop instanceof InstanceOP);
		System.out.println(aob instanceof A);
		System.out.println(aob2 instanceof A);
		System.out.println(aob2 instanceof InstanceOP);
	}
};