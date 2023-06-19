// Program to demonstrate the Methods in java
public class Method1{
	public String name = "JAVA";
	static int version = 17;
	// user defined method defination
	public String getName(){
		// instance methods can access instance variables directly
		return name;
	}
	public void display(){
		// instance methods can access instance method directly
		System.out.println("Hey, I'm "+getName());
		// instance methods can access instance variables directly
		System.out.print("Version "+version+".0.1");
	}
	
	public static void main(String[] args){
		// instance methods are part of object
		Method1 m = new Method1();
		// object is needed for calling
		m.display();
	}
}