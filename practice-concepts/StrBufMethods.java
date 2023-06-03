// Program to demonstrate the use of stringbuffer methods
import java.io.*;
public class StrBuff{
	public static void main(String[] args){
		// StringBuffer objects are mutable - we can change their content
		StringBuffer sb = new StringBuffer("Computer");
		
		// Append() add a new string at the end of old string
		sb.append("Programming");
		System.out.println(sb);
		
		// Insert a new string at specified position in old string
		sb.insert(8, " ");
		System.out.println(sb);
		
		// Replace range of string with new string
		sb.replace(8,9,"__");
		System.out.println(sb);
		
		// Delete a range of string from original string
		sb.delete(8,10);
		System.out.println(sb);
		
		// Return the reverse of a string
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		
		// Return the current capacity of string buffer
		System.out.println(sb.capacity());
		
		// Return Character at a position
		System.out.println(sb.charAt(3));
		
		// Delete Character at a position
		System.out.println(sb.deleteCharAt(3));
		
		// Find length of a string
		System.out.print(sb.length());
		
		// Ensure atlest capacity
		sb.ensureCapacity(40);
	}
}