// program to demonstrate the while loop
// find the sum of one to ten
public class AddOneToTen{
	public static void main(String[] args){
		int i = 1 ;
		int sum = 0 ;
		// calculate sum of 1 to 10
		while( i <= 10 ){
			sum += i ;
			i ++ ;
		}
		System.out.print("Sum of one to ten is "+sum);
	}
}