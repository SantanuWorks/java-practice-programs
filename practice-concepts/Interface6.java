// Program to practice the concept of interface in java.
public class Interface6{
	public static void main(String[] args){
		B b = new B();
		b.call();
	}
}
interface A{
	// It can also contain private, static and private static methods 
	// we can define body of these methods
	// these methods are not accessible are not outside
	private void display(){
		System.out.println("Display");
	}
	static void show(){
		System.out.println("Show");
	}
	private static void clear(){
		System.out.println("Clear");
	}
	void call();
}
class B implements A{
	public void call(){
		System.out.println("Private, Static, Private Static methods are not accessible outside, they are hidden");
	}
}