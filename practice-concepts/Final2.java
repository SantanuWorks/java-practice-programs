// Program to demonstrate the use of final keyword- Final Classes
public class Final2{
	public static void main(String[] args){
		A1 a1 = new A1();
		a1.m1();
		A2 a2 = new A2();
		a2.m2();
		B b = new B();
		b.m3();
	}
}
// Final classes can not be extended)(inherited)
final class A1{
	void m1(){
		System.out.println("A1:m1()");
	}
}
// Below will produce error - can not be inherited
class A2 extends A1 {
	void m2(){
		System.out.println("A2:m2()");
	}
}
class B extends A2{
	void m3(){
		System.out.println("B:m3()");
	}
}