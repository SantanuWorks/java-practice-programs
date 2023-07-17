// Program to demonstrate the use of static keyword - Static Block
// Static block is used to initialize static variables
public class Static1{
	static int a;
	// executed when main class gets loaded
	static{
		a = 0;
		System.out.println("Main:Static Block Executed 1");
	}
	static{
		System.out.println("Main:Static Block Executed 2");
	}
	public static void main(String[] args){
		A a = new A(); // static block will execute
		A b = new A();
		A c = new A();
	}
	static{
		System.out.println("Main:Static Block Executed 3");
	}
}
class A{
	static int c;
	// gets executed when first object is created
	static{
		c = 0;
		System.out.println("A:Static Block Executed");
	}
}