// find the octal equivalent of an decimal integer
// enter the number through command line
public class Octal{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int num = n ;
		int revoct = 0, oct = 0;
		int rem ;
		while( n > 0 ){
			rem = n % 8 ; n /= 8 ;
			revoct = revoct*10 + rem ;
		}
		while( revoct > 0 ){
			rem = revoct % 10 ; revoct /= 10 ;
			oct = oct*10 + rem ;
		}
		System.out.print(oct);
	}
}