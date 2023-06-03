// Program to demonstrate various String class methods
public class StrMethods{
	public static void main(String[] args){
		String str = "Computer";
		char[] arr = { 'c', 'o', 'm', 'p', 'u', 't', 'e', 'r' };
		
		// Print character unicode point of a character specified index
		System.out.println("Unicode point of o is "+str.codePointAt(1));
		
		// Print character unicode point of a character before specified index
		System.out.println("Unicode point of c is "+str.codePointBefore(1));
		
		// Count the unicode points between the range of index
		System.out.println("No of unicode points between 1 and 4 is "+str.codePointCount(1,4));
		
		// Return a subsequence of a string between a range of index
		System.out.println("Subsequence between 1 and 4 is "+str.subSequence(1,4)); // here is the main line
		
		// It takes in parameter a String suffix and return true if the String has same suffix.
		System.out.println("Is computer end with er "+str.endsWith("er"));
		
		// It takes in parameter a String prefix and returns true if the String has a same prefix
		System.out.println("Is computer start with co "+str.startsWith("co"));
		
		// It takes in four parameters, start and end refers to the range which is to copied to the character array,
		// destination is the character array to be copied to, and destination_start is the starting location of the destination array.
		str.getChars(1,4,arr,2);
		for( int i = 0 ; i < 8 ; i++ ) System.out.print(arr[i]);
		System.out.println();
		
		// It converts the entire String to the character array. 
		arr = str.toCharArray();
		for( int i = 0 ; i < 8 ; i++ ) System.out.print(arr[i]);
		System.out.println();
		
		// It returns hashcode of the given String. 
		System.out.println("Hash code is "+str.hashCode());
		
		// intern() adds string object in string pool if it does not exist
		// returns the reference of string object in string pool
		System.out.println("String pooled string object is "+str.intern());
		
		// It returns true if the length of the String is 0.
		System.out.println("String is empty: "+str.isEmpty());
		
		// Replace all the occurances of substring
		System.out.println("Replaced istring is "+"CoCoMoModel".replaceAll("Co","Mo"));
		
		// Replace first occurances of substring
		System.out.println("Replaced istring is "+"CoCoMoModel".replaceFirst("Co","Mo"));
		
		// Split the string based on a string 
		String[] strs ;
		strs = "ComputeCjjhCosnsCor".split("jj") ;
		for( String ech: strs ) System.out.println(ech);
		System.out.println();
		
		// Join strings 
		System.out.print(str.join("Co","Mo"));
	}
}