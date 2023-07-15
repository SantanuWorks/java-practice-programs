// Program to demonstrate the use of super keyword - access overridden fields and behaviour
public class Super3{
	public static void main(String[] args){
		B b = new B("B");
		b.call();
	}
}
class A{
	String name;
	A(String name){ this.name = name; }
	void display(){ System.out.println("Name: "+name); }
	void show(){ System.out.println("Not overridden: show()"); }
}
class B extends A{
	String name;
	B(String name){ super("A"); this.name = name; }
	void display(){ 
		// access parent class fields
		System.out.println("Parent-Name: "+super.name); 
		System.out.println("Child-Name: "+name); 
		// super keyword is not required as it it an inherited methods
		// super keyword can be used to avoid the confusion of overridden methods
		show();
	}
	void call(){ 
		// call to super class display()
		super.display();
		display(); // call to current class display()
	}
}