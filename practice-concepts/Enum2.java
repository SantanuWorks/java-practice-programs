// Program to demonstrate the concept of Enumeration or Java Enum - Constructors
public class Enum2{
	public static void main(String[] args){
		A a = A.CONSTA;
		B b = B.CONSTB;
	}
}
enum A{
	CONSTA;
	// Enum can have package-private constructor
	A(){
		System.out.println("Enum-A: A()");
	} 
}
enum B{
	CONSTB;
	// Enum can have private constructor
	private B(){
		System.out.println("Enum-B: B()");
	} 
}