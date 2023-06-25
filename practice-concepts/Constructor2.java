// Program to demonstrate various the concept of constructor - parameterized constructor
public class Constructor2{
	public static void main(String[] args){
		Color c1 = new Color("Red", 101);
		c1.display();
		Color c2 = new Color("Blue", 233);
		c2.display();
	}
}
class Color{
	String name;
	int code;
	Color(String name, int code){
		this.name = name;
		this.code = code;
	}
	void display(){
		System.out.println("Color is "+name+"\nColor code is "+code);
	}
}