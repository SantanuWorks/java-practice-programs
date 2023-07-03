// Program to practice the concept of interface in java.
public class Interface5{
	public static void main(String[] args){
		B b = new B();
		b.display();
		// Interface can not be instantiated
		A a = new A(); // error
	}
}
interface A{
	// constructor do not support constructor
	A(){} // error
	void display();
}
class B implements A{
	public void display(){
		System.out.print("Interface can not be instantiated");
	}
}