// Program to demonstrate the Methods in java - method overloading
public class Overloading5{
	public static void main(String[] args){	
		Test t = new Test();
		String arg1 = null;
		Integer arg2 = null;
		t.f(null); // this will produce error - both f() can accept null - no type of null specified
		t.f(arg1); // type of null value specified i.e. String
		t.f(arg2); // type of null value specified i.e. Integer
	}
}
class Test{
	// parameter of object type
	public void f(String s){ System.out.println("String call"); }
	public void f(Integer i){ System.out.println("Integer call"); }
}