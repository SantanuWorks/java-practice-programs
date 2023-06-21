// Program to demonstrate the concept of abstraction
public class Abstraction5{
	public static void main(String[] args){
		Define d = new Define();
		d.display();
		d.calc(23);
	}
}
// abstract class without any abstract method only used to inherit but cannot be instantiated
abstract class Test{
	void display(){
		System.out.println("Test");
	}
	void calc(int a){
		System.out.println("calc("+a+") = "+a*1.32);
	}
}
class Define extends Test{}