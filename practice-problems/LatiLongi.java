// find distance between two places in nautical miles
// if latitude and longitude given degree. 
import java.util.Scanner ;
public class LatiLongi{
	public static void main(String args[]){
		int L1, L2, G1, G2;
		double D ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Latitude(L1,L2): ");
		L1 = sc.nextInt(); L2 = sc.nextInt();
		System.out.print("Enter Longitude(G1,G2): ");
		G1 = sc.nextInt(); G2 = sc.nextInt();
		double C = Math.sin(L1)*Math.sin(L2)+Math.cos(L1)*Math.cos(L2)*Math.cos(G2-G1);
		D = 3963 * Math.acos(C);
		System.out.print("Distance in nautical miles : "+D);
		sc.close();
	}
}