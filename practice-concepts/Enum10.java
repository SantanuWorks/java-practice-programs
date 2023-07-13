// Program to demonstrate the concept of Enumeration or Java Enum
public class Enum10{
	enum Color{
		ORANGE, WHITE, GREEN;
	}
	public static void main(String[] args){
		// name() return the name of the constant 
		// toString() returns the string object containing the name of the constant
		Color orange = Color.ORANGE;
		System.out.println("name(): "+orange.name());
		System.out.println("toString(): "+orange.toString());
		
		Color white = Color.WHITE;
		System.out.println("name(): "+white.name());
		System.out.println("toString(): "+white.toString());
		
		Color green = Color.GREEN;
		System.out.println("name(): "+green.name());
		System.out.println("toString(): "+green.toString());
		
		// compareTo() returns C1.ordinal() - C2.ordinal()
		// compares two enum constants
		System.out.println(orange+" Vs "+green+": "+orange.compareTo(green));
	}
}