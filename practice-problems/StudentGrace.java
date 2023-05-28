// Write a program to find the grace marks for a student using switch. The user should enter the 
// class obtained by the student and the number of subjects he has failed in. Using the following logic.
// first class && failed subjects > 3 then no grace otherwise 5 marks per subject.
// second class && failed subjects > 2 then no grace otherwise 4 marks per subject.  
// third class && failed subjects > 1 then no grace otherwise 5 marks per subject.
// enter the class and no of failed subjects through the command line
public class StudentGrace{
	public static void main(String[] args){
		int c = Integer.parseInt(args[0]);
		int fs = Integer.parseInt(args[1]);
		int grace = 0 ;
		switch(c){
			case 1: if( fs <= 3 ) grace = fs * 5 ;
					break ;
			case 2: if( fs <= 2 ) grace = fs * 4 ;
					break ;
			case 3: if( fs == 1 ) grace = 1 * 5 ;
					break ;
			default: System.out.print("Invalid class!");
		}
		System.out.print("Total grace marks is "+grace);
	}
}