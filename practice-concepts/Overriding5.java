// Program to demonstrate the OOP concepts - method overriding
public class Overriding5{
	public static void main(String[] args){
		
	}
}
class A{
	public A(){ System.out.println("A's constructor"); }
}
class B extends A{
	// constructor can not be overloaded
	A(){ System.out.println("A's constructor"); }
}