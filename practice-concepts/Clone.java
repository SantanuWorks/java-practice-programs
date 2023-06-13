// Program to demonstrate cloning
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		int[] Arr = {2,4,5,6};
		// clone 1d array - deep copy
		int[] ArrCp = Arr.clone();
		
		// change in ArrCp won't affect Arr
		ArrCp[0]++ ;
		
		for( int a:Arr ) System.out.print( a + " " );
		System.out.println();
		for( int a:ArrCp ) System.out.print( a + " " );
		System.out.println();
		
		int[][] Arr2d = { {1,3,5},{2,4,6} };
		// clone 2d array - shallow copy - subarrays are shared
		int[][] Arr2dCp = Arr2d.clone();
		
		System.out.println("Before change: ");
		for(int[] ar:Arr2d) for(int a:ar) System.out.print( a + " " );
		System.out.println();
		for(int[] ar:Arr2dCp) for(int a:ar) System.out.print( a + " " );
		System.out.println();
	
		// change in ArrCp will change in Arr too
		Arr2dCp[0][0]++;
		
		System.out.println("After change: ");
		for(int[] ar:Arr2d) for(int a:ar) System.out.print( a + " " );
		System.out.println();
		for(int[] ar:Arr2dCp) for(int a:ar) System.out.print( a + " " );
	}
}