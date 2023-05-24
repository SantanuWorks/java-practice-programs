// program to demonstrate the do while loop
// User manu program
import java.util.Scanner ;
public class Menu{
	public static void main(String[] args){
		int opt ;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("1.Tell me a secret\n2. Tell me your name\n3. Go to hell\nChoose me: ");
			opt = sc.nextInt();
			if( opt == 1 ) System.out.println("shhh!! You are working with JAVA!!!");
			else if( opt == 2 ) System.out.println("hey! My name is JAVA!!!");
			else if( opt == 3 ) System.out.print("unmm! Going to hell. Bye! Bye!");
			else System.out.println("You are choosing wrong!!!");
		}
		while( opt != 3 );
		sc.close();
	}
}