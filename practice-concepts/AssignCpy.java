// Program to demonstrate copy using assignment
import java.util.Arrays;
public class AssignCpy{
	public static void main(String[] args){
		int[] Arr = {2,4,5,6};
		int[] ArrCp = Arr ; // assigns the reference of Arr to ArrCp
		
		for( int a:Arr ) System.out.print( a + " " );
		System.out.println();
		for( int a:ArrCp ) System.out.print( a + " " );
		System.out.println();
		
		// change in  ArrCp can change in Arr
		ArrCp[0]++;

		for( int a:ArrCp ) System.out.print( a + " " );
		System.out.println();
		for( int a:Arr ) System.out.print( a + " " );
		System.out.println();
	}
}