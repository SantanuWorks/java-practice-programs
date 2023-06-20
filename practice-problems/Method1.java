// Write a method to calculate the factorial of a number. 
// User input
import java.io.*;
public class Method1{
	public long factorial(int n){
		if( n == 0 ) return 1;
		else return (n) * factorial(n-1);
	}
	public static void main(String[] args) throws IOException{
		int n;
		Method1 m = new Method1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number: ");
		n = Integer.parseInt(br.readLine());
		System.out.print("Factorial of "+n+" is "+m.factorial(n));
		br.close();
	}
}