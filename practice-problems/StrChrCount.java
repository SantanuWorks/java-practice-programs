// Write a Java program to count the number of characters (alphanumeric only) 
// that occur more than twice in a given string
// case sensitive
import java.util.Scanner;
public class StrRemWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		int chctr = 0 ;
		int c = 0 ;
		for( int i=0; i<26; i++ ){
			for( int j=0; j<str.length(); j++ )
				if(str.charAt(j)==(65+i)) c++ ;
				else if(str.charAt(j)==(97+i)) c++ ;
			if(c>2) chctr++;
			c=0;
		}
		for( int i=0; i<10; i++ ){
			for( int j=0; j<str.length(); j++ )
				if(str.charAt(j)==(48+i)) c++ ;
			if(c>2) chctr++;
			c=0;
		}
		System.out.print("No of characters: "+chctr);
		sc.close();
	}
}