// Array practice programs 
// Java Program to Check if Two Arrays Are Equal or Not
import java.util.Arrays;
public class Array19{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4};
		int arr2[] = {1,2,3,4,5};
		int s1 = arr1.length;
		int s2 = arr2.length;
		if( s1 != s2 ) System.out.print("Arrays are not equal");
		else{
			boolean f = false;
			Arrays.sort(arr1); Arrays.sort(arr2);
			for( int i = 0 ; i < s1 ; i ++ ){
				if(arr1[i] != arr2[i]){ f = true; break; }
			}
			if(f) System.out.print("Arrays are not equal");
			else System.out.print("Arrays are equal");
		}
	}
}