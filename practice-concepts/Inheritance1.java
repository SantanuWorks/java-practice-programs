// Program to demonstrate the OOP concepts - Inheritance - Single 
public class Inheritance1{
	public static void main(String[] args){
		B o = new B();
		o.show();
		o.display(); // access parent 
	}
}
// two classes involved - one is parent, second is child of first
class A{
	void display(){ System.out.println("A's display()"); }
}
class B extends A{
	void show(){ System.out.println("B's show()"); }
}