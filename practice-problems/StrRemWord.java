// Write a Java program that removes a specified word from given text.
// Return the updated string
// Input through command line
public class StrRemWord{
	public static void main(String[] args){
		StringBuffer text = new StringBuffer(args[0]);
		System.out.println(text);
		String str = args[1];
		int start = text.indexOf(str) ;
		int last = start + str.length() - 1 ;
		String remtext = text.delete(start,last).toString();
		System.out.print(remtext);
	}
}