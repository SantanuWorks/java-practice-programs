// Program to demonstrate the use of super keyword - call to constructor
public class Super1{
	public static void main(String[] args){
		B1 b1 = new B1();
		B2 b2 = new B2();
	}
}
// super class keyword is used to call super class constructor for object creation
// It can happen implicitly if not written by the programmer
class A1{
	A1(){ System.out.println("Super:A1"); }
}
class B1 extends A1{ 
	// call to super() is not mentioned
	B1(){ System.out.println("Child:B1"); }
}
// In this class call to super() is mentioned( should be first-line )
class A2{
	A2(){ System.out.println("Super:A2"); }
}
class B2 extends A2{ 
	B2(){ super(); System.out.println("Child:B2"); }
}