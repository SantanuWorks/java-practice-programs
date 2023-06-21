// Program to demonstrate the concept of abstraction
public class Abstraction3{
	public static void main(String[] args){
		Redefine r = new Redefine();
		r.calc(10);
		System.out.println("delc("+10+") = "+r.delc(11));
		System.out.print("appc() = "+r.appc());
	}
}
abstract class Test{
	abstract void calc(int a);
	abstract int delc(int a);
	abstract int appc();
}
// sub-class must define the abstract method
// if child fails to implement all the abstract methods then it should
// declared as abstract and its next level child should implement the rest.
abstract class Define extends Test{
	void calc(int a){
		int b = 10 * a ;
		System.out.println("calc("+a+") = "+b);
	}
}
class Redefine extends Define{
	int delc(int a){
		int b = 10 * a ;
		return b;
	}
	int appc(){
		return 10;
	}
}