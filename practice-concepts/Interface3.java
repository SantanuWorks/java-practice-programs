// Program to practice the concept of interface in java.
public class Interface3{
	public static void main(String[] args){
		C obj = new C();
		obj.f();
	}
} 
// Using interfaces implement multiple inheritance
interface A{ 
	void f();
	// we can not have body inside the interfaces
	// following will produce error
	void m() {} // dummy method
}
interface B{ void f(); }
class C implements A,B{
	public void f(){
		System.out.print("I'm a method");
	}
}