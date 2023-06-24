// Program to demonstrate the OOP concepts - method overriding
public class Overriding1{
	public static void main(String[] args){
		A ref = new A();
		ref.f();
		ref = new B();
		ref.f();
		ref = new C();
		ref.f();
		ref = new D();
		ref.f();
	}
}
class A{
	void f(){ System.out.println("A's f()"); }
}
class B extends A{
	void f(){ System.out.println("B's f()"); }
}
class C extends B{
	void f(){ System.out.println("C's f()"); }
}
class D extends C{
	void f(){ System.out.println("D's f()"); }
}