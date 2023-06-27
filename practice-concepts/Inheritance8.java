// Program to demonstrate the OOP concepts - Inheritance - Single 
public class Inheritance8{
	public static void main(String[] args){
		B o = new B();
		o.display();
		o.show();
	}
}
// two classes involved - one is parent, second is child of first
class A{
	// private members are not inherited( only public and protected are inherited )
	private void strict(){}
	void display(){ System.out.println("A's display()"); }
	static void show(){ System.out.println("A's show()"); }
}
class B extends A{
	// we can add extra members to child class which are not present in parent class
	int a = 10;
	void extra(){}
	// instance method of parent will be hidden
	void display(){ System.out.println("B's display()"); }
	// static method of parent will be hidden 
	static void show(){ System.out.println("B's show()"); }
}