// program to find the type of character entered
// A-Z capital ( 65-90 )
// a-z small ( 97-122 )
// 0-9 digits ( 48-57 )
// special characters ( others )
// input through command line
public class CharType{
	public static void main(String[] args){
		char ch = args[0].charAt(0) ;
		if( ch >= 65 && ch <= 90 ) System.out.print("It is a capital letter");
		else if( ch >= 97 && ch <= 122 ) System.out.print("It is a small case letter");
		else if( ch >= 48 && ch <= 57 ) System.out.print("It is a digit");
		else System.out.print("It is a special character");
	}
}