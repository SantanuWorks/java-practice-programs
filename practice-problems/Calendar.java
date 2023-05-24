// if 01/01/01 was Monday then find day name of 1st Jan of any inputed year
// input through command line
public class Calendar{
	public static void main(String[] args){
		int ly, ny, y, ys, b = 1, tdays, day ;
		y = Integer.parseInt(args[0]);
		// find total years 
		ys = ( y - 1 ) - b;
		ly = ys / 4;
		ny = ys - ly ;
		tdays = ly * 366 + ny * 365 + 1 ;
		day = tdays % 7 ;
		switch(day){
			case 6: System.out.print("Sunday"); break ;
			case 0: System.out.print("Monday"); break ;
			case 1: System.out.print("Tuesday"); break ;
			case 2: System.out.print("Wednessday"); break ;
			case 3: System.out.print("Thursday"); break ;
			case 4: System.out.print("Friday"); break ;
			case 5: System.out.print("saturday");
		}
	}
}