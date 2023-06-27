// Program to demonstrate the OOP concepts - Inheritance - Single 
public class Inheritance7{
	public static void main(String[] args){
		B o = new B();
		o.accessParent();
	}
}
class A{
	int a = 10;
	A(){ System.out.println("A's constructor"); }
	void display(){ System.out.println("A's display()"); }
}
class B extends A{
	B(){
		super(); // call to parent class constructor 
	}
	void accessParent(){		
		System.out.println("Value = "+super.a); // access data member of parent
		super.display(); // access method of parent
	}
}