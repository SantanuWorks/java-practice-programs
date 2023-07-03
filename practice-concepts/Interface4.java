// Program to practice the concept of interface in java.
public class Interface4{
	public static void main(String[] args){
		B b = new B();
		b.display();
		// we cannot change final variable 
		b.a = 23; // error code
	}
}
interface A{
	// this is public static final
	int a = 10;
	void display();
}
class B implements A{
	public void display(){
		System.out.print("a = "+a);
	}
}