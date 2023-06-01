// program to demonstate the creation of string using a byte array
import java.nio.charset.Charset ;
public class StrByteArr{
	public static void main(String[] args){
		byte[] arr = { 100, 101, 102, 103 } ; // byte array 
		// String(byte[] arr)
		String str = new String(arr) ; // basic way 
		System.out.println(str);
		// we can specify the character set for decoding
		Charset cs = Charset.defaultCharset();
		// String(byte[] arr, char_set ch)
		str = new String(arr,cs) ;
		System.out.println(str);
		// specify the character set name only
		// String(byte[] arr, String char_set_name)
		// str = new String(arr,"ascii") ;
		System.out.println(str);
		// specify the start index and lengh up to in the byte array
		//String(byte[] byte_arr, int start_index, int length)
		str = new String(arr, 1, 3); 
		System.out.println(str);
		// index and length can be combined with charset and charset name
		// String(byte[] byte_arr, int start_index, int length, Charset char_set)
		str = new String(arr, 1, 3, cs); 
		System.out.print(str);
		// str = new String(arr, 1, 3, "ascii"); 
		// System.out.println(str);
		
	}
}