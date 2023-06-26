// Program to demonstrate various the concept of constructor - Static Block
public class Constructor11{
	public static void main(String[] args){
		A a1 = new A();
		A a2 = new A();
	}
}
class A{
	// static block is called once for all object
	// it is executed when for first time memory is created for object
	// it is executed before the constructor
	// order of execution depends on the order of defination
	static{
		System.out.println("Static Block 1");
	}
	A(){
		System.out.println("Default Constructor");
	}
	static{
		System.out.println("Static Block 2");
	}
}
