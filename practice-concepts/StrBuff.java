// Program to demonstrate the use of stringbuffer
import java.io.*;
public class StrBuff{
	public static void main(String[] args){
		// StringBuffer objects are mutable - we can change their content
		StringBuffer sb = new StringBuffer("!!");
		sb.append("Hello");
		System.out.println(sb);
		sb.append(" World");
		System.out.print(sb);
	}
}