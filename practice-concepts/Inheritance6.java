// Program to demonstrate the OOP concepts - Inheritance - Hybrid 
public class Inheritance6{
	public static void main(String[] args){
		D o1 = new D();
		o1.show4();
		o1.show3();
		o1.show2();
		o1.show1();
		E o2 = new E();
		o2.show5();
		o2.show3();
		o2.show2();
		o2.show1();
	}
}
// two or more kind of mechanism together for hybrid model
// Multiple and Hierarchical 
interface A{ void show1(); }
interface B{ void show2(); }
class C implements A,B{ 
	public void show1(){ System.out.println("A's show()"); }
	public void show2(){ System.out.println("B's show()"); }
	void show3(){ System.out.println("C's show()"); }
}
class D extends C{ void show4(){ System.out.println("D's show()"); } }
class E extends C{ void show5(){ System.out.println("E's show()"); } }