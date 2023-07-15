// Program to demonstrate the use of super keyword - Parameterized call
public class Super2{
	public static void main(String[] args){
		C c = new C();
	}
}
class A{
	A(){ System.out.println("Class-A: A()"); }
	A(int a){ System.out.println("Class-A: A(a) = "+a); }
}
class B extends A{
	B(){ System.out.println("Class-B: B()"); }
	B(char b){ super(5); System.out.println("Class-B: B(b) = "+b); }
}
class C extends B{
	C(){ this("XAPQ"); System.out.println("Class-C: C()"); }
	C(String c){ super('Z'); System.out.println("Class-C: C(c) = "+c); }
}