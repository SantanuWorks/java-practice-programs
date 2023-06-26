// Program to demonstrate various the concept of constructor - constructor chaining
public class Constructor7{
	public static void main(String[] args){
		// chaining within the same class
		A a = new A();
	}
}
class A{
	A(){
		this(3);
		System.out.println("Chain Level 3");
	}
	A(int a){
		this("");
		System.out.println("Chain Level 2");
	}
	A(String s){
		System.out.println("Chain Level 1");
	}
}