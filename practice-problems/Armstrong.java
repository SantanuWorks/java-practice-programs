// find all the armstrong numbers between 1 and 500 
// Armstrong number if sum of cubes of each digit of the number is equal to the number itself
public class Armstrong{
	public static void main(String[] args){
		int digit ; int sum = 0 ; int num ;
		System.out.print("Armstrong numbers are ");
		for( int i = 1; i <= 500 ; i ++ ){
			num = i ;
			digit = num % 10 ; num /= 10 ; sum += ( digit * digit * digit ) ;
			digit = num % 10 ; num /= 10 ; sum += ( digit * digit * digit ) ;
			digit = num % 10 ; sum += ( digit * digit * digit ) ;
			if( sum == i ) System.out.print(i+" ");
			sum = 0 ;
		}
	}
}