// Write a method to determine whether the year is a leap year or not.
// User input
import java.io.*;
public class Method4{
	public String checkLeap(int year){
		if( year % 400 == 0 || ( year % 100 != 0 && year % 4 == 0 ) ) return "leap";
		else return "not leap";
	}
	public static void main(String[] args) throws IOException{
		int year;
		Method4 m = new Method4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the year: ");
		year = Integer.parseInt(br.readLine());
		System.out.print(year+" is "+m.checkLeap(year)+" year");
		br.close();
	}
}