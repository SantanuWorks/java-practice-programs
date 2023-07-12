// Program to demonstrate the concept of Wrapper Class in java - Character Wrapper Class
public class Wrapper3{
	public static void main(String[] args){
		Character ch = 'A';
		Character c1 = 'A';
		Character c2 = 'B';
		
		// Character Wrapper Class Methods
		Character c = new Character('A'); // deprecated

		// Character valueOf(char ch)
		System.out.println(Character.valueOf('A'));

		// boolean isLetter( char ch ) - checks whether a character is letter or not
		System.out.println(Character.isLetter('A'));

		// boolean isDigit( char ch ) - checks whether a character is digit or not
		System.out.println(Character.isDigit('1'));
		
		// boolean isWhitespace( char ch ) - checks whether a character is whitespace or not
		System.out.println(Character.isWhitespace('A'));
		
		// boolean isUpperCase( char ch ) - checks whether a character is upper case or not
		System.out.println(Character.isUpperCase('A'));
		
		// boolean isLowerCase( char ch ) - checks whether a character is lower case or not
		System.out.println(Character.isLowerCase('A'));
		
		// char toUpperCase( char ch ) - converts lowercase letter to uppercase 
		System.out.println(Character.toUpperCase('a'));
		
		// char toLowerCase( char ch ) - converts uppercase letter to lowercase
		System.out.println(Character.toLowerCase('A'));
		
		// String toString( char ch ) - returns a string class object representing the specified character object 
		System.out.println(Character.toString('A'));
		
		// String toString() - returns a string class object representing the specified character object 
		System.out.println(ch.toString());
		
		// char charValue() - return the value in the character object
		System.out.println(ch.charValue());
		
		// static int compare(char x, char y) - compares two primitive char values numerically
		System.out.println(Character.compare('a','A'));
		
		// int compareTo(Character ch) - compares two char objects numerically
		System.out.println(c1.compareTo(c2));
		
		// boolean equals(Object obj) - checks whether two objects are equal or not
		System.out.print(c1.equals(c2));
	} 
}