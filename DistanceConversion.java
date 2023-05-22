// program convert distance in km to meter, inch, feet and centimeter
// 1km = 1000 m
// 1km = 3280.84 feet
// 1km = 39370.1 in
// 1km = 100000 cm
import java.io.* ;
public class DistanceConversion{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter distance in k.m. ");
		int dist = Integer.parseInt(br.readLine());
		float distm = dist * 1000;
		float distf = dist * 3280.84f;
		float distin = dist * 39370.1f;
		float distcm = dist * 100000;
		System.out.print("In Meters => "+distm+"\nIn Feets => "+distf+"\nIn Inches => "+distin+"\nIn Centimeters => "+distcm);
	}
}