// Program to demonstrate the use of static keyword - Static Variables
public class Static2{
	public static void main(String[] args){
		A a = new A();
		a.objectCount();
		A b = new A();
		A c = new A();
		A d = new A();
		a.objectCount();
		System.out.println("a.c = "+a.a);
		System.out.println("b.c = "+b.a);
		System.out.println("c.c = "+c.a);
		System.out.print("d.c = "+d.a);
	}
}
class A{
	// Static variables are created once for all objects
	// it is shared with all 
	int b;
	static int a = 0;
	void countObjects(){ a++; }
	A(){ countObjects(); }
	void objectCount(){ System.out.println(a+" object(s) present"); }
}