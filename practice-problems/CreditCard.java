// Valid a credit card for correctness - it is a 16 digit no
// Enter no through command line
public class CreditCard{
	public static void main(String[] args){
		String cardno = args[0] ;
		if( cardno.length() != 16 ){ System.out.print("Credit Card No is invalid"); return; }
		int s1 = 0, s2 = 0 ; int dig = 0 ;
		for( int i = 0 ; i < 16 ; i += 2 ){
			s2 += (cardno.charAt(i+1)-48) ;
			dig = (cardno.charAt(i)-48)*2 ;
			dig = (dig > 9)? dig-9 : dig ;
			s1 += dig ;
		}
		if( (s1+s2) % 10 == 0 ) System.out.print("Credit Card No is valid");
		else System.out.print("Credit Card No is invalid");
	}
}