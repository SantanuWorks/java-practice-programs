// Program to demonstrate the concept of abstraction
public class Abstraction2{
	public static void main(String[] args){
		// we can indirectly create object of Test type
		Test t = new Define();
		t.calc(12);
	}
}
abstract class Test{
	abstract void calc(int a);
}
// sub-class must define the abstract method
class Define extends Test{
	void calc(int a){
		int b = 10 * a ;
		System.out.print("calc("+a+") = "+b);
	}
}