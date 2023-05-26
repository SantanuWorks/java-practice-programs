// demonstrate If Else Clause
import java.io.* ;
public class IfElseClause{
	public static void main(String args[]) throws IOException{
		// vote program
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		System.out.print("Enter your age: ");
		int age = Integer.parseInt( br.readLine() );
		if( age >18 ) System.out.print("You can vote!");
		else System.out.print("You cann't vote!");
		br.close(); // close 
	}
}