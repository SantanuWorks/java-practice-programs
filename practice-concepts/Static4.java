// Program to demonstrate the use of static keyword - Static Class
public class Static4{
	public static void main(String[] args){
		// outer class object is required to create  non-inner class object
		Outer.Inner1 i1 = new Outer().new Inner1();
		i1.m1();
		// static inner class do not need outer class object
		Outer.Inner2 i2 = new Outer.Inner2();
		i2.m2();
	}
}
// Outer/Top-level class cannot be static
class Outer{
	void display(){ System.out.println("Non-static Member"); }
	static void show(){ System.out.println("Static Member"); }
	class Inner1{
		void m1(){ display(); show(); }
	}
	// inner class can be made static only
	static class Inner2{
		// it can access only static members
		void m2(){ show(); }
	}
}