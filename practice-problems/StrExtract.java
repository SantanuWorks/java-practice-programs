// Program to extract part of the given string from the specified position. 
// also no of characters to be extracted. if it is 0 then extract entire string till the end
// position and length entered through command line
public class StrExtract{
	public static void main(String[] args){
		String str = "Java is a programming language";
		int last ;
		int pos = Integer.parseInt(args[0]) - 1;
		int len = Integer.parseInt(args[1]);
		if( len == 0 ) last = str.length() - 1 ;
		else last = pos + len - 1 ;
		if( last >= str.length() || len < 0 || pos < 0 || pos >= str.length() ) System.out.print("Not possible");
		else for( int i = pos ; i <= last ; i ++ ) System.out.print(str.charAt(i));
	}
}