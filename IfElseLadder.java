// program to demonstrate If Else Ladder
import java.io.* ;
public class IfElseLadder{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Grade program
		System.out.print("Enter your percent: ");
		float percent = Float.parseFloat(br.readLine());
		System.out.print("Your grade is ");
		if( percent >= 90 ) System.out.print("A+");
		else if( percent >= 80 && percent < 90 ) System.out.print("A+");
		else if( percent >= 70 && percent < 80 ) System.out.print("A");
		else if( percent >= 60 && percent < 70 ) System.out.print("B");
		else if( percent >= 50 && percent < 60 ) System.out.print("C");
		else if( percent >= 40 && percent < 50 ) System.out.print("D");
		else if( percent >= 30 && percent < 40 ) System.out.print("E");
		else if( percent < 30 ) System.out.print("F");
		br.close(); // close
	}
}