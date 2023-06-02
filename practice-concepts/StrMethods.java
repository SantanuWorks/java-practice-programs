// Program to demonstrate various String class methods
public class StrMethods{
	public static void main(String[] args){
		String str = "Computer";
		
		// Find the length of the string - no of characters
		System.out.println("Length of String is "+str.length());
		
		// Return the character present at ith index
		System.out.println("Character at index 2 is "+str.charAt(2));
		
		// Return the substring from the ith  index character to end.
		System.out.println("Substring from index 2 is "+str.substring(2));
		
		// Returns the substring from i to j-1 index.
		System.out.println("Substring from index 2 to 5 is "+str.substring(2,6));
		
		// Concatenates specified string to the end of this string.
		System.out.println("Science is concated to give "+str.concat(" Science"));
		
		// Returns the index within the string of the first occurrence of the specified string.
		// returns -1 if index not found 
		System.out.println("Index of ompu is "+str.indexOf("ompu"));
		
		// Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
		// returns -1 if index not found 
		System.out.println("Index of ompu starting from 2 is "+str.indexOf("ompu",2));
		
		// Returns the index within the string of the last occurrence of the specified string.
		// returns -1 if index not found 
		System.out.println("Last index of ompu is "+str.indexOf("ompu"));
		
		// Compares this string to the specified object.
		System.out.println("Compare with computer is "+str.equals("computer"));
		
		// Compares string to another string, ignoring case considerations.
		System.out.println("Compare with computer is "+str.equalsIgnoreCase("computer"));
		
		// Compares two string lexicographically. Returns S1 - S2
		System.out.println("Compare with comuter is "+str.compareTo("comuter"));
		
		// Compares two string lexicographically, ignoring case considerations. Returns S1 - S2
		System.out.println("Lower case of computer is "+str.compareToIgnoreCase("comuter"));
		
		// Converts all the characters in the String to lower case. 
		System.out.println("Compare with comuter is "+str.toLowerCase());
		
		// Converts all the characters in the String to upper case. 
		System.out.println("Upper case of computer is "+str.toUpperCase());
		
		// Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
		System.out.println("Trimmed string is "+" Computer ".trim());
		
		// Returns new string by replacing all occurrences of oldChar with newChar.
		System.out.print("Replaced string is "+str.replace('m','n'));
		
	}
}