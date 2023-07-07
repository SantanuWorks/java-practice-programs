// Program to practice the concept of interface in java.
public class Interface9{
	public static void main(String[] args){
		D d = new D();
		d.show();
	}
} 
// default methods have body in interface
interface A{
	default void m(){
		System.out.println("A's m()");
	}
}
interface B extends A{
	void show();
}
interface C extends A{
	void show();
}
class D implements B,C{
	public void show(){
		B.super.m();
		C.super.m();
	}
}