// find the wind chill factor when temperature and wind velocity is given
// wcf = 35.74 + 0.6215*t + (0.4275*t - 35.75) * v^0.16
import java.util.Scanner ;
public class ChillFactor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double t, v, wcf ;
		System.out.print("Enter temperature and wind velocity: ");
		t = sc.nextDouble(); v = sc.nextDouble();
		wcf = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v,0.16) ;
		System.out.print("Wind Chill Factor is "+wcf);
		sc.close();
	}
} 