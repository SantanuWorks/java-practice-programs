// Program to demonstrate the Methods in java - method overloading
public class Method9{
	// we can overload main() - but compiler only picks the default once
	public static void main(String[] args){		
	}
}
class Test{
	// methods differ in static keyword cannot be overloaded
	static void display(String s){}
	void display(String s){}
	
	// methods cannot be overloaded on the basis of return type
	int display(String s){}
	char display(String s){}
}