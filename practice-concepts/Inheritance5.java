// Program to demonstrate the OOP concepts - Inheritance - Hybrid 
public class Inheritance5{
	public static void main(String[] args){
		C o1 = new C();
		o1.show3();
		o1.show2();
		o1.show1();
		D o2 = new D();
		o2.show4();
		o2.show2();
		o2.show1();
	}
}
// two or more kind of mechanism together for hybrid model
// Single and Hierarchical 
class A{
	void show1(){ System.out.println("A's display()"); }
}
class B extends A{
	void show2(){ System.out.println("B's show()"); }
}
class C extends B{
	void show3(){ System.out.println("C's show()"); }
}
class D extends B{
	void show4(){ System.out.println("D's show()"); }
}