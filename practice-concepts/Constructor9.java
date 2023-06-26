// Program to demonstrate various the concept of constructor - constructor chaining
public class Constructor9{
	public static void main(String[] args){
		B b = new B();
	}
}
class A{
	A(){
		this(1);
		System.out.println("Super 2");
	}
	A(int a){
		System.out.println("Super 1");
	}
}
class B extends A{
	B(){
		this(1);
		System.out.println("Child 2");
	}
	B(int a){
		super();
		System.out.println("Child 1");
	}
}