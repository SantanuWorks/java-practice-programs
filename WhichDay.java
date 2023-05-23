// program to find day name based on day number
// day number input through the command line
public class WhichDay{
	public static void main(String args[]){
		int day = Integer.parseInt(args[0]);
		switch(day){
			case 1: System.out.print("Sunday"); break ;
			case 2: System.out.print("Monday"); break ;
			case 3: System.out.print("Tuesday"); break ;
			case 4: System.out.print("Wednessday"); break ;
			case 5: System.out.print("Thursday"); break ;
			case 6: System.out.print("Friday"); break ;
			case 7: System.out.print("saturday"); break ;
			default: System.out.print("incorrect day number!");
		}
	}
}