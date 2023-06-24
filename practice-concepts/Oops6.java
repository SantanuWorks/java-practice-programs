// Program to demonstrate the OOP concepts - method overriding
public class Oops6{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ref;
		
		ref = a;
		ref.show();
		
		ref = b;
		ref.show();
		
		ref = c;
		ref.show();
	}
}
class A{
	void show(){ System.out.println("A's show()"); }
}
class B extends A{
	void show(){ System.out.println("B's show()"); }
}
class C extends A{
	void show(){ System.out.println("C's show()"); }
}