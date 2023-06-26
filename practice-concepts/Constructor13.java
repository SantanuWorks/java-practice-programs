// Program to demonstrate various the concept of constructor - Singleton Class
public class Constructor13{
	public static void main(String[] args){
		Singleton s = Singleton.createObject();
		s.display();
		s.i = s.i + 1;
		s.display();
		Singleton sref = Singleton.createObject(); // no matter how many reference variable you create they 
		// will point one constructor
		sref.display();
	}
}
// Singleton class allows to create only one object
class Singleton{
	private static Singleton oneObj = null;
	int i = 0;
	void display(){
		System.out.println("Current i = "+i);
	}
	private Singleton(){
		System.out.println("Private Constructor");
	}
	public static Singleton createObject(){
		if( oneObj == null ) oneObj = new Singleton();
		return oneObj;
	}
}
