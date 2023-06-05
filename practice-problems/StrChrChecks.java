// A string is created by using another string's letters. 
// Letters are case sensitive. Write a Java program that checks the letters 
// of the second string are present in the first string. Return true otherwise false
// Enter strings through the command line
public class StrChrChecks{
	public static void main(String[] args){
		String str1 = args[0];
		String str2 = args[1];
		boolean Flag = true ;
		for( int i = 0 ; i < str2.length() ; i++ )
			if(str1.indexOf(str2.charAt(i)) == -1)
				{ Flag = false ; break ; }
		System.out.print(Flag);
	}
}