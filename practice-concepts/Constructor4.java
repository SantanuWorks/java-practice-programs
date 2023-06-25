// Program to demonstrate various the concept of constructor
public class Constructor4{
	public static void main(String[] args){
		// this will produce error - we can not create object of this class
		Test t = new Test();
	}
}
class Test{
	// constructor can be private if we don't want object creation
	private Test(){
		// it should not return any value 
		return this; 
		// this will work, since it is not returning anything
		// btw, constructor returns the current instance or object
		return;
	}
}