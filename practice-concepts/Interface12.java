// Program to practice the concept of interface in java - Functional Interface & Marker Interface
public class Interface12{
	public static void main(String[] args){
		B b = new B();
		b.show();
	}
}
@FunctionalInterface // annotation helps in checking the correctness of this interface 
// at compiler level it helps to check whether interface has only one method or not
interface A{
	void show();
	void del(); // will produce error 
}
// A marker interface is an interface which is empty ( no methods, fields )
public interface Marker{
	// nothing to add
}
class B implements A{
	public void show(){
		System.out.println("Functional Interface");
	}
}