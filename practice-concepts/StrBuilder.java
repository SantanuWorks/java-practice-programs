// Program to demonstrate the use of stringbuilder
public class StrBuilder{
	public static void main(String[] args){
		// StringBuilder objects are mutable - we can change their content
		StringBuilder sb = new StringBuilder("!!");
		sb.append("Hello");
		System.out.println(sb);
		sb.append(" World");
		System.out.print(sb);
	}
}