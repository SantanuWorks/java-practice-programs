// Program to demonstrate the concept of Enumeration or Java Enum - Enum can implement intterfaces
public class Enum4{
	public static void main(String[] args){
		C c = C.CA;
		c.display();
		c.show();
	}
}
interface A{
	void display();
}
interface B{
	void show();
}
// enum can implment multiple interfaces
enum C implements A,B{
	CA, CB;
	public void display(){
		System.out.println("Message: "+C.CA);
	}
	public void show(){
		System.out.print("Message: "+C.CB);
	}
}