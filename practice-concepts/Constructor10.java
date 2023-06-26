// Program to demonstrate various the concept of constructor - Init Block
public class Constructor10{
	public static void main(String[] args){
		A a1 = new A();
		A a2 = new A(0);
		A a3 = new A("");
	}
}
class A{
	// init block is called whenever a new object is created
	// it is executed before the constructor
	// order of execution depends on the order of defination
	{
		System.out.println("Common Code in Init Block 1");
	}
	A(){
		System.out.println("Default Constructor");
	}
	A(int a){
		System.out.println("int Constructor");
	}
	{
		System.out.println("Common Code in Init Block 2");
	}
	A(String a){
		System.out.println("String Constructor");
	}
	{
		System.out.println("Common Code in Init Block 3");
	}
}
