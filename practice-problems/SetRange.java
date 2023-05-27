// Write a program to find the range of a set of numbers entered through the keyboard. Range is the difference
// between the smallest and biggest number in the list.
import java.util.Scanner ;
public class SetRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, ech, small = 0, big = 0 ;
		boolean flag = true ;
		System.out.print("Enter number of elements in the set: ");
		n = sc.nextInt();
		System.out.print("Enter all the "+n+" elements of the set: ");
		for( int i = 0 ; i < n ; i++ ){
			ech = sc.nextInt();
			if( flag ){ flag = false; small = big = ech ; continue; }
			if( ech > big ) big = ech ;
			else if( ech < small ) small = ech ;
		}
		System.out.print("Range of the given set is "+(big-small));
		sc.close();
	}
}