// program to check whether the entered year is leap year or not
// input through command line
public class Leap{
	public static void main(String[] args){
		int year = Integer.parseInt(args[0]);
		if( year % 400 == 0 ) System.out.print(year+" is a leap year");
		else if( year % 100 == 0 ) System.out.print(year+" is not a leap year");
		else if( year % 4 == 0 ) System.out.print(year+" is a leap year");
		else System.out.print(year+" is not a leap year");
	}
}