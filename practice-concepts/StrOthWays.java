// program to demonstate the creation of string using a Unicode points, string builder and buffer
public class StrOthWays{
	public static void main(String[] args){
		// using unicode points
		// String(int[] uni_code_points, int offset, int count)
		int unicode[] = { 100, 101, 102, 103, 104, 105 };
		String str = new String(unicode, 1, 3);
		System.out.println(str);
		// using StringBuffer class
		StringBuffer s_buffer = new StringBuffer("java");
		str = new String(s_buffer);
		System.out.println(str);
		// using StringBuilder class
		StringBuilder s_build = new StringBuilder("java");
		str = new String(s_build);
		System.out.print(str);
	}
}