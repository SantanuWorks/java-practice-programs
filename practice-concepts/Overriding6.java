// Program to demonstrate the OOP concepts - method overriding
public class Overriding1{
	public static void main(String[] args){
		A r = new B();
		r.f();
	}
}
class A{
	protected void f(){ System.out.println("A's f()"); }
}
class B extends A{
	// access modifier provides more acess to the overridden method 
	// protected can be public in child
	// protected cannot be private in child - error
	public void f(){ System.out.println("B's f()"); }
}