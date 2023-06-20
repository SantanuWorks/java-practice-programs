// Write a method to obtain the prime factors of a given number.
// User input
import java.io.*;
public class Method5{
	public void primeFactors(int n){
		System.out.print("Prime factors of "+n+" are: ");
		boolean fl;
		for( int i = 2; n > 1; i ++ ){
			fl = false;
			for(int j = 2; j < i; j ++ ) if( i % j == 0 ){ fl = true; break; }
			if( fl ) continue;
			while( n % i == 0 ){
				System.out.print(i+" ");
				n /= i;
			}
		}
	}
	public static void main(String[] args) throws IOException{
		int n;
		Method5 m = new Method5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number: ");
		n = Integer.parseInt(br.readLine());
		m.primeFactors(n);
		br.close();
	}
}