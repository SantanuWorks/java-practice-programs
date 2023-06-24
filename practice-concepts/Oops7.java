// Program to demonstrate the OOP concepts - abstraction
public class Oops7{
	public static void main(String[] args){
		A ref = new B();
		ref.f();
	}
}
abstract class A{
	abstract void f();
}
class B extends A{ void f(){ System.out.println("A's f()"); } }