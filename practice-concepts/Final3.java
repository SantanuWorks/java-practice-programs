// Program to demonstrate the use of final keyword - Final Method
public class Final3{
	public static void main(String[] args){
		B b = new B();
		b.m1();
		b.m2();
	}
}
class A{
	void m1(){
		System.out.println("A:Can be overridden");
	}
	// Final methods can not be overridden later in the inheritance hierarchy
	final void m2(){
		System.out.println("Can not be overridden");
	}
}
class B extends A{
	void m1(){
		System.out.println("B:Overridden");
	}
	// This will produce error
	void m2(){
		System.out.println("B:Overridden");
	}
}