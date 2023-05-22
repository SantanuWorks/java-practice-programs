// program to demonstrate nested If Else
import java.io.* ;
public class IfElseNested{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// find positive or negative and even or odd numbers
		System.out.print("Enter your number: ");
		int num = Integer.parseInt( br.readLine() );
		if( num == 0 ) System.out.print("ZERO!");
		else if( num > 0 ){
			System.out.print("POSITIVE! ");
			if( num % 2 == 0 ) System.out.print("EVEN!");
			else System.out.print("ODD!");
		}else{
			System.out.print("NEGATIVE! ");
			if( num % 2 == 0 ) System.out.print("EVEN!");
			else System.out.print("ODD!");
		}
		br.close(); // close
	}
}