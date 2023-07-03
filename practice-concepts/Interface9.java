// Program to practice the concept of interface in java.
public class Interface9{
	public static void main(String[] args){
		C c = new C();
		c.show();
	}
}
// default methods have body in interface
interface A{
	default void m(){
		System.out.println("A's m()");
	}
}
interface B{
	default int m(){
		System.out.println("B's m()");
	}
}
class C implements A,B{
	void show(){
		A.super.m();
		B.super.m();
	}
}