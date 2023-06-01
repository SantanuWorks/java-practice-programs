// program to demonstrate various methods of string creation
public class StringCreate{
	public static void main(String[] args){
		// using string literal
		String str = "Computer";
		System.out.println(str);
		// using new keyword
		String str2 = new String("Calculator");
		System.out.println(str2);
		// using StringBuffer class
		StringBuffer str3 = new StringBuffer("Software");
		System.out.println(str3);
		// using StringBuilder class
		StringBuilder str4 = new StringBuilder();
		str4.append("Hardware");
		System.out.println(str4);
		StringBuilder str5 = new StringBuilder("System ");
		str5.append(" Programming");
		System.out.print(str5);
	}
}