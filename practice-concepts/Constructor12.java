// Program to demonstrate various the concept of constructor - Private Constructor
public class Constructor12{
	public static void main(String[] args){
		// private constructor doesnot allow to create object outside the class
		// this will generate error
	    A a1 = new A();
		// calling public constructor
		A a2 = new A(1);
	}
}
class A{
	private A(){
		System.out.println("I'm strict - private");
	}
	public A(int a){
		// inside class we can access constructor and create object
		this();
		System.out.print("I'm chill - public");
	}
}
