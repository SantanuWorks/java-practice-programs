// Program to find reverse of a given string
public class StrConcate{
	public static void main(String[] args){
		String str = "Java";
		String rev = "";
		System.out.println("Original is "+str);
		for( int i = 0 ; i < str.length() ; i ++ )
			rev = str.charAt(i)+rev ; 
		System.out.println("Reverse is "+rev);
		
		// Using reverse() 
		StringBuffer strb = new StringBuffer(rev);
		System.out.println("Original is "+strb);
		rev = strb.reverse().toString() ;
		System.out.print("Reverse is "+rev);
	}
}