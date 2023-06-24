// Program to demonstrate the OOP concepts - method overriding
public class Overriding3{
	public static void main(String[] args){
		A ref = new B();
		ref.f1(); // will call A's bydefault
		ref.f2(); - error
		ref.f3(); - private access error
	}
}
class A{
	static void f1(){ System.out.println("A's static f1()"); }
	final void f2(){ System.out.println("A's final f2()"); }
	private void f3(){ System.out.println("A's private f3()"); }
}
class B extends A{
	// static method will be hidden by the subclass - 
	static void f1(){ System.out.println("A's static f1()"); } 
	
	// final methods can not be override by default - error
	final void f2(){ System.out.println("A's final f2()"); }
	
	// private methods are hidden to subclass -
	private void f3(){ System.out.println("A's private f3()"); }
}