// Program to demonstrate the concept of Enumeration or Java Enum - Methods, Fields
class Enum3{
	public static void main(String[] args){
		Color c = Color.RED;
		c.display();
	}
}
enum Color{
	RED,PINK,BLUE;
	String name; // Instance variable
	Color(){
		name = this.toString();
	}
	// Method
	void display(){
		System.out.print("Color is "+name);
	}
}