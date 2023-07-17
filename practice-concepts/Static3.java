// Program to demonstrate the use of static keyword - Static Method
// Belongs to class shared among all objects
public class Static3{
	int a;
	static int b;
	void display(){ System.out.println("Non-static f()"); }
	static void show(){ System.out.println("Static f()"); }
	static void f(){
		// static methods can not access instance variables and methods
		// display();
		// a = 0;
		// they can only access static members
		show();
		b = 1;
	}
	public static void main(String[] args){
		// static method can be called without using object and before creating objects
		System.out.println(b);
		f();
	}
}