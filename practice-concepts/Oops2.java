// Program to demonstrate the OOP concepts
// now lets create an object 
public class Oops2{
	public static void main(String[] args){
		System.out.println("class declaration in java");
		// object creation
		MyClass mcobj ; // declared 
		mcobj = new MyClass(); // instantiated - memory allocated
		// access the property
		System.out.println("Accessing property 'classno' => "+mcobj.classno);
		System.out.print("Accessing property 'classname' => "+mcobj.classname);
	}
}
// it is a class
class MyClass{
	// declare variables here - called property
	int classno = 1 ;
	String classname = "MyClass" ;
}