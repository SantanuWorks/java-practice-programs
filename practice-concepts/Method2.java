// Program to demonstrate the Methods in java
public class Method2{
	static String name = "JAVA";
	static int version = 17;
	// user defined method defination
	public String getName(){
		// instance methods can access static variables directly
		return name;
	}
	public static void display(){
		// static methods cann't access instance method directly
		Method2 m = new Method2();
		System.out.println("Hey, I'm "+m.getName());
		// static methods can access static variables directly
		System.out.print("Version "+version+".0.1");
	}
	
	public static void main(String[] args){
		// static methods are part of class - shared with objects
		Method2 m = new Method2();
		// class-name, object can be used to call static methods
		Method2.display();
		// this will work
		// m.display();
		// we can omit if caller method is aslo static
		// display();
	}
}