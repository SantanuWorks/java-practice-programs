// Write a program to calculate overtime pay of 10 employees. Overtime is paid at the rate of Rs. !2.00 per hour
// for every hour worked above 40 hours. Assume that employees do not work for fractional part of an hour.
import java.io.*;
public class EmpOvertime{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int fixtime = 40 ;
		int tottime ;
		int payperhr = 12 ;
		int overtimepay ;
		for( int i = 1 ; i < 11 ; i ++ ){
			System.out.print("Enter working time for Employee "+i+": ");
			tottime = Integer.parseInt(br.readLine());
			if( tottime > fixtime ) overtimepay = ( tottime - fixtime ) * payperhr ;
			else overtimepay = 0;
			System.out.println("Overtime pay for Employee "+i+" is "+overtimepay);
		}
	}
}