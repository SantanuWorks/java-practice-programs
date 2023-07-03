// Program to practice the concept of interface in java.
public class Interface8{
	public static void main(String[] args){
		B b = new B();
		b.m1();
		b.m2();
	}
}
// default methods have body in interface
interface A{
	void m1();
	default void m2(){
		System.out.println("m2()");
	}
}
class B implements A{
	public void m1(){
		System.out.println("m1()");
	}
}