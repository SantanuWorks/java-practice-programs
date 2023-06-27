// Program to demonstrate the OOP concepts - Inheritance - Hierarchical 
public class Inheritance3{
	public static void main(String[] args){
		B o1 = new B();
		o1.show1();
		o1.display();
		C o2 = new C();
		o2.show2();
		o2.display();
		D o3 = new D();
		o3.show3();
		o3.display();
	}
}
// One parent has many childs( more than one )
class A{
	void display(){ System.out.println("A's display()"); }
}
class B extends A{
	void show1(){ System.out.println("B's show()"); }
}
class C extends A{
	void show2(){ System.out.println("C's show()"); }
}
class D extends A{
	void show3(){ System.out.println("D's show()"); }
}