// Program to demonstrate the concept of abstraction
public class Abstraction8{
	public static void main(String[] args){
		
	}
}
// abstract is must if class contains atleast one abstract method - else error
class Test{
	abstract void display();
	void calc(int a){
		System.out.println("calc("+a+") = "+a*1.32);
	}
}