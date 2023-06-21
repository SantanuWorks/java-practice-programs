// Program to demonstrate the concept of abstraction
public class Abstraction6{
	public static void main(String[] args){
		Test.display();
		Test.calc(12);
	}
}
// static methods can be used without using any object - without child class
abstract class Test{
	static void display(){
		System.out.println("Test");
	}
	static void calc(int a){
		System.out.println("calc("+a+") = "+a*1.32);
	}
}