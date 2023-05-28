// When interest compounds q times per year at an annual rate of r% for n years, the principal p compounds to an 
// amount a as per the following formula a = p(1+r/q)^nq
// write program to read 10 set of p,q,r,n and calculate the corresponding a.
import java.io.* ;
public class InterestCompound{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p, q, r, n ;
		double a ;
		for( int i = 0 ; i < 10 ; i++ ){
			System.out.print("Enter p, q, r and n: ");
			p = Integer.parseInt(br.readLine());
			q = Integer.parseInt(br.readLine());
			r = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			a = p * Math.pow( 1+r/q , n*q );
			System.out.println("Amount 1 = "+a);
		}
		br.close();
	}
}