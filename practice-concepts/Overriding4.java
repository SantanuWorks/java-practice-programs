// Program to demonstrate the OOP concepts - method overriding
public class Overriding4{
	public static void main(String[] args){
		Sup ref = new Sub();
		ref.display();
		ref.show();
	}
}
class Sup{
	void display(){ System.out.println("A's display()"); }
	static void show() { System.out.println("A's show()"); }
	void f1() { System.out.println("A's f1()"); }
	static void f2() { System.out.println("A's f2()"); }
}
class Sub extends Sup{
	void display(){ System.out.println("B's display()"); } // overrides
	static void show() { System.out.println("A's show()"); } // parent method hides sub method
	static void f1() { System.out.println("A's f1()"); } // error
	void f2() { System.out.println("A's f2()"); } // error
}