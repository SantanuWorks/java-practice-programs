// Program to demonstrate the use of final keyword - Final Variable
public class Final1{
	public static void main(String[] args){
		final A a = new A(); // Final reference variable can not be changed once initialized e.g. Final Array
		// a = new A(); ---> Error
		// Local final variable
		final int CONSTANT;
	}
}
// Final variables can not be re-initialized
class A{
	// Instance final variable can be initialized at declaration
	final int P = 12;
	final int Q; // Final Blank Variable
	static final int X1 = 23;
	// static final variables should be initialized inside a static initializer
	final static int X2;
	// Static initializer block
	static{
		X2 = 24;
	}
	final int Z1,Z2,Z3,Z4;
	// Final variables can be initialized inside a initializer block
	{
		Z1 = 11;
		Z2 = 12;
		Z3 = 13;
		Z4 = 14;
	}
	// Final variables can be initialized inside a constructor
	A(){
		// Instance final variable can be initialized inside the default constructor
		Q = 23;
	}
	void display(){
		// Local final variable can be initialized later 
		final int R;
		final int S; // Final Blank Variable - not initialized
		R = 12;
		// R = 15; ---> Error
	}
}