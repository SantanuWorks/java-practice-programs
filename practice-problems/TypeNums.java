// write a program to enter numbers till the user wants. At the end it should display the count of positive,
// negative or zeros
import java.io.* ;
public class TypeNums{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n ;
		byte pos = 0, neg = 0, zero = 0;
		char op = 'Y' ;
		do{
			System.out.print("Enter number: ");
			n = Integer.parseInt(br.readLine());
			if( n == 0 ) zero++;
			else if( n > 0 ) pos++;
			else neg++;
			System.out.print("Do you want to continue?(Y/n): ");
			op = br.readLine().charAt(0);
		}
		while( op == 'Y' || op == 'y' );
		System.out.println("Number of positives: "+pos);
		System.out.println("Number of negatives: "+neg);
		System.out.print("Number of zeros: "+zero);
		br.close();
	}
}