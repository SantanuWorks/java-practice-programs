// Program to demonstrate various the concept of constructor - constructor chaining
public class Constructor8{
	public static void main(String[] args){
		// chaining within the same class
		C c = new C();
		// same will be output if we dont provide super() - compiler add by default
	}
}
class A{
	A(){
		System.out.println("Chain Level 1");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("Chain Level 2");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("Chain Level 3");
	}
}