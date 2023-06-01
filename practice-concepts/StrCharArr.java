// program to demonstate the creation of string using a character array
public class StrCharArr{
	public static void main(String[] args){
		char[] arr = { 'C', 'O', 'M', 'P', 'U', 'T', 'E', 'R' }; // byte array 
		// String(char[] char_arr) 
		String str = new String(arr) ; // basic way 
		System.out.println(str);
		// String(char[] char_array, int start_index, int count)
		// specify the index and length to extract 
		str = new String(arr, 1, 4) ; // basic way 
		System.out.print(str);
	}
}