// Program to practice the concept of interface in java.
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
class B implements A{
	public void show(){
		System.out.println("Functional Interface");
	}
}