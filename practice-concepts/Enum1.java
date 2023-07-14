// Program to demonstrate the concept of Enumeration or Java Enum - Enum Declaration
// Enum can be declared inside a class too
public class Enum1{
	enum Direction{
		EAST, WEST, NORTH, SOUTH;
	}
	// Enum can not be declared inside a method
	public static void main(String[] args){
		Color myColor = Color.RED;
		Direction myDirection = Direction.NORTH;
		System.out.println("Your color is "+myColor);
		System.out.print("Your direction is "+myDirection);
	}
}
// Enum can be declared outside class
enum Color{
	RED, BLUE, PINK;
}