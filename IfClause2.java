// demonstrate if statement
import java.io.*;
public class IfClause2{
	public static void main(String args[]) throws IOException{
		// condition must result into boolean type
		// if( 3 ); --> will product error
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int n = Integer.parseInt(br.readLine());
		if( n < 18 )
			// part of if block
			System.out.println("You are not eligible to vote!");
			// not a part of if block
			System.out.print("Your age is "+n);
	}
}