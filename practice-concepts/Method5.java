// Program to demonstrate the Methods in java - method overriding
public class Method5{
	public static void main(String[] args){
		C c = new C();
		B b = new B();
		A a = new A();
		a.display();
		b.display();
		c.display();
	}
}
class A{
	void display(){ System.out.println("Class A"); }
}
class B extends A{
	// overriding method of A
	void display(){ System.out.println("Class B"); }
}
class C extends A{
	// overriding method of A
	void display(){ System.out.println("Class C"); }
}