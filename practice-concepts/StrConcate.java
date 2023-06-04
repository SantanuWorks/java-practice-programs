// Program to demonstrate concatenation of String 
public class StrConcate{
	public static void main(String[] args){
		// Add char, int, float to string to string
		char ch = 'A' ;
		int in = 10 ;
		float fl = 12.3f ;
		String str = "It is ";
		String con = str + ch ;
		System.out.println(con);
		con = str + in ;
		System.out.println(con);
		con = str + fl ;
		System.out.println(con);
		// convert char to string
		str = ""+ch ;
		System.out.print(str);
	}
}