// Program to demonstrate the concept of abstraction
public class Abstraction4{
	public static void main(String[] args){
		Define d1 = new Define(10);
		Define d2 = new Define();
		d1.display();
	}
}
// abstract can have constructor but it is called when object of derived 
// class is created
abstract class Test{
	abstract void display();
	Test(){
		System.out.println("Test Constructor");
	}
	Test(int a){
		System.out.println("Test Parameterized Constructor");
	}
}
class Define extends Test{
	void display(){
		System.out.println("Abstract Class Test");
	}
	Define(){
		System.out.println("Define Constructor");
	}
	Define(int a){
		super(a);
		System.out.println("Define Parameterized Constructor");
	}
}