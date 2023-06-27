// Program to demonstrate the OOP concepts - Inheritance - Multiple 
public class Inheritance4{
	public static void main(String[] args){
		D o = new D();
		o.show1();
		o.show2();
		o.show3();
	}
}
// multiple inheritance is not supported by java
// but we can achieve this mechanism using interfaces 
// one child has more than one parent - multiple inheritance
// class cannot extend many classes
interface A{
	void show1();
}
interface B{
	void show2();
}
interface C{
	void show3();
}
class D implements A,B,C{
	public void show1(){ System.out.println("A's show()");  }
	public void show2(){ System.out.println("B's show()");  }
	public void show3(){ System.out.println("C's show()");  }
}