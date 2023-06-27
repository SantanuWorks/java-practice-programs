// Program to demonstrate the OOP concepts - Inheritance - Multilevel 
public class Inheritance2{
	public static void main(String[] args){
		C o = new C();
		o.show();
		o.display();
		o.expose();
		// we cannot access grand parent members directly from grand child 
		// we can access through parent class 
		o.accessGrand();
	}
}
// more than two classes involved - chain of classes parent of one class is child to other class and so on 
class A{
	int a = 10;
	void display(){ System.out.println("A's display()"); }
}
class B extends A{
	void show(){ System.out.println("B's show()"); }
	void accessParent(){
		System.out.print("Value = "+super.a);
	}
}
class C extends B{
	void expose(){ System.out.println("C's expose()"); }
	void accessGrand(){
		super.accessParent();
	}
}