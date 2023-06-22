// Program to demonstrate the Methods in java - abstract method
public class Method1{
	public static void main(String[] args){
		Define d = new Define();
		d.display();
	}
}
abstract class Test{
	// abstract method do not have body
	abstract void display();
}
class Define extends Test{
	// abstract method is overriden in sub class
	// child class provides the implenentation to the abstract method
	void display(){
		System.out.print("Abstract Method Speaking!");
	}
}