// Program to demonstrate the concept of abstraction
public abstract class Test{
	int a;
	// contructors
	Test(){ System.out.println("Abstraction"); }
	Test(int a){ this.a = a; }
	// static method 
	static void display(){ System.out.println("Abstraction"); }
	// abstract method
	abstract void calc();
	// final method - cann't be overriden
	final void reside(){ System.out.println("Abstraction"); }
	// concrete method
	int drop(){ return 1; }
}
public class Abstraction1{
	public static void main(String[] args){
		// cann't create object of Test - this will show error
		Test t = new Test();
	}
}