// Write a method power(a,b), to calculate the value of a raise to b. 
// User input
import java.io.*;
public class Method2{
	public long power(int a, int b){
		if(b == 0) return 1;
		else return (a) * power(a,b-1);
	}
	public static void main(String[] args) throws IOException{
		int a, b;
		Method2 m = new Method2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the base: ");
		a = Integer.parseInt(br.readLine());
		System.out.print("Enter the power: ");
		b = Integer.parseInt(br.readLine());
		System.out.print(a+" raised to "+b+" is "+m.power(a,b));
		br.close();
	}
}