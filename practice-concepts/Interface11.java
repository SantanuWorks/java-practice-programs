// Program to practice the concept of interface in java - nested interface
public class Interface11{
	public static void main(String[] args){
		impleB ib = new impleB();
		ib.display();
		impleD id = new impleD();
		id.display();
	}
} 
// interfaces can be nested inside a class or interface
interface A{
	interface B{
		void display();
	}
}
class impleB implements A.B{
	public void display(){
		System.out.println("A.B's display()");
	}
}
class C{
	interface D{
		void display();
	}
}
class impleD implements C.D{
	public void display(){
		System.out.println("C.D's display()");
	}
}