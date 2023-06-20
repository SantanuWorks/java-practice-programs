// Write a general purpose method to covert any given number into roman numerals. 
// User input
import java.io.*;
public class Method3{
	private String freq(int times, char ch){
		String roman = "";
		for(int i = 1 ; i <= times ; i ++) roman += ch ;
		return roman;
	}
	public String roman(int n){
		String rom = "";
		int times;
		times = n / 1000; n %= 1000; rom += freq(times,'M');
		times = n / 500; n %= 500; rom += freq(times,'D');
		times = n / 100; n %= 100; rom += freq(times,'C');
		times = n / 50; n %= 50; rom += freq(times,'L');
		times = n / 10; n %= 10; rom += freq(times,'X');
		times = n / 5; n %= 5; rom += freq(times,'V');
		times = n / 1; n %= 1; rom += freq(times,'I');
		return rom;
	}
	public static void main(String[] args) throws IOException{
		int n;
		Method3 m = new Method3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number: ");
		n = Integer.parseInt(br.readLine());
		System.out.print("Roman equivalent of "+n+" is "+m.roman(n));
		br.close();
	}
}