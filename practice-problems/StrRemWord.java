// Write a Java program that removes a specified word from given text.
// Return the updated string
import java.util.Scanner ;
public class StrRemWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text: ");
		StringBuffer text = new StringBuffer(sc.nextLine());
		System.out.print("Enter the string to be deleted: ");
		String str = sc.nextLine();
		int start = text.indexOf(str) ;
		int last = start + str.length() - 1 ;
		String remtext = text.delete(start,last).toString();
		System.out.print(remtext);
		sc.close();
	}
}