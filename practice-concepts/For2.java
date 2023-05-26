// program to demonstrate the for loop 
// to show the block {} use
public class For2{
	public static void main(String[] args){
		// add from 1 to 100 
		int sum = 0 ;
		for( int i = 1 ; i <= 100 ; i++ )
			System.out.print(i+" ");
			sum += i ; // will generate error // not a part of for - so it will not add anything
		System.out.print("Sum = "+sum); // prints last i which is added to sum
	}
}