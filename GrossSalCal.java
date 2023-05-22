// calculate the gross salary 
// gross = basic salary + allowances
import java.io.* ;
public class GrossSalCal{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your salary: ");
		int salary = Integer.parseInt(br.readLine());
		// dearness allowance is 40% of basic salary
		int da = 40 * salary / 100 ;
		// hosue rent allowance is 20% of basic salary
		int hra = 20 * salary / 100 ;
		int gross = salary + hra + da ;
		System.out.print("Your gross salary is "+gross);
		br.close();
		// program can be imporved to support float type
	}
}