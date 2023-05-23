// Consider a currency system in which there are notes of six denominations, 
// namely, Rs.1,Rs.2,Rs.5,Rs.10,Rs.50,Rs.100. If a sum of Rs.N is entered through
// the keyboard, write a program to compute the smallest number of notes that will
// combine to give Rs.N.
// input though command line
public class Currency{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int one=0,two=0,five=0,ten=0,fifty=0,hund=0;
		int sum = n ;
		hund = n / 100 ; n = n - hund*100 ;
		fifty = n / 50 ; n = n - fifty*50 ;
		ten = n / 10 ; n = n - ten*10 ;
		five = n / 5 ; n = n - five*5 ;
		two = n / 2 ; n = n - two*2 ;
		one = n / 1 ; n = n - one*1 ;
		System.out.println("Given sum is "+sum);
		System.out.println("100s => "+hund);
		System.out.println("50s => "+fifty);
		System.out.println("10s => "+ten);
		System.out.println("5s => "+five);
		System.out.println("2s => "+two);
		System.out.print("1s => "+one);
	}
} 