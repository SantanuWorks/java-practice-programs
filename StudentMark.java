// program to find total marks and percent in five subject where max mark for each subject is 100
// we will use command line for five mark input
public class StudentMark{
	public static void main(String args[]){		
		int sum, totalmax = 500 ; // each max is 100
		float percent ;
		sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2]) + Integer.parseInt(args[3]) + Integer.parseInt(args[4]);
		percent = ( sum * 100.0f ) / totalmax ; 
		System.out.println("Your aggregate mark is "+sum);
		System.out.print("Obtained percentage is "+percent);
	}
}