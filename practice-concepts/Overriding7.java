// Program to demonstrate the OOP concepts - method overriding
public class Overriding1{
	public static void main(String[] args){
		A ref = new B();
		System.out.println("Release code is "+ref.release());
		System.out.print("Version is ");
		ref.version().show();
	}
}

class Sup{ void show(){ System.out.print("10.3.2"); } }
class Sub extends Sup{ }

class A{
	// overriding method can have return type as sub type of super class method or should be same 
	// other than above is illegal
	// datatypes are not applicable(wrapper classes as well - all share same level in hierarchy)
	Object release() { return null; }
	Sup version() { return new Sup(); }
}
class B extends A{
	String release() { return "null"; }
	Sub version() { return new Sub(); }
}