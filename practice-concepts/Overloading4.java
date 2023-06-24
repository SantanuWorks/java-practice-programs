// Program to demonstrate the Methods in java - method overloading
public class Overloading4{
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