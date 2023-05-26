// Write a program that receives month and dob as input and prints the corresponding Zodiac sign 
// based on the following table
// Capricorn Dec 22 - Jan 19
// Aquarius Jan 20 - Feb 17
// Pisces Feb 18 - Mar 19
// Aries Mar 20 - April 19
// Taurus April 20 - May 20
// Gemini May 21 - June 20
// Cancer Jun 21 - Jul 22
// Leo Jul 23 - Aug 22
// Virgo Aug 23 - Sep 22
// Libra Sep 23 - Oct 22 
// Scorpio Oct 23 - Nov 21
// Sagittarius Nov 22 - Dec 21
// Enter month number and date through command line
public class ZodiacSign{
	public static void main(String[] args){
	int m = Integer.parseInt(args[0]);
	int d = Integer.parseInt(args[1]);
	if ( (m == 12 && ( d>=22 && d<=31 )) || (m == 1 && ( d>=1 && d<=19 ))) System.out.print("Capricorn");
	else if( (m == 1 && ( d>=20 && d<=31 )) || (m == 2 && ( d>=1 && d<=17 ))) System.out.print("Aquarius");
	else if( (m == 2 && ( d>=18 && d<=28 )) || (m == 3 && ( d>=1 && d<=19 ))) System.out.print("Pisces");
	else if( (m == 3 && ( d>=20 && d<=31 )) || (m == 4 && ( d>=1 && d<=19 ))) System.out.print("Aries");
	else if( (m == 4 && ( d>=20 && d<=30 )) || (m == 5 && ( d>=1 && d<=20 ))) System.out.print("Taurus");
	else if( (m == 5 && ( d>=21 && d<=31 )) || (m == 6 && ( d>=1 && d<=20 ))) System.out.print("Gemini");
	else if( (m == 6 && ( d>=21 && d<=30 )) || (m == 7 && ( d>=1 && d<=22 ))) System.out.print("Cancer");
	else if( (m == 7 && ( d>=23 && d<=31 )) || (m == 8 && ( d>=1 && d<=22 ))) System.out.print("Leo");
	else if( (m == 8 && ( d>=23 && d<=31 )) || (m == 9 && ( d>=1 && d<=22 ))) System.out.print("Virgo");
	else if( (m == 9 && ( d>=23 && d<=30 )) || (m == 10 && ( d>=1 && d<=22 ))) System.out.print("Libra");
	else if( (m == 10 && ( d>=23 && d<=31 )) || (m == 11 && ( d>=1 && d<=21 ))) System.out.print("Scorpio");
	else if( (m == 11 && ( d>=22 && d<=30 )) || (m == 12 && ( d>=1 && d<=21 ))) System.out.print("Sagittarius");
		
	}
}