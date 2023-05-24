// convert temperature in fahrenheit to degree celcius 
// will use scanner class
import java.util.Scanner ;
public class FahrDeg{
	public static void main(String[] args){
		// scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in F: ");
		float temf = sc.nextFloat();
		float temc = ( temf - 32.0f ) * (5.0f/9.0f) ;
		System.out.print("Temperature in celcius is: "+temc);		
		sc.close();
	}
}