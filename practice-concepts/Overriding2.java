// Program to demonstrate the Methods in java - method overriding
public class Overriding2{
	public static void main(String[] args){	
		A a = new A();
		System.out.println(a.s);
		B b = new B();
		System.out.println(b.s);
		// but; data member is accessed irrespective of object i.e. depends on reference type
		a = b;
		System.out.print(a.s);
	}
}
class A{ String s = "Class A's Var"; }
class B extends A{ String s = "Class B's Var"; }