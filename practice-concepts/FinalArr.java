// Program to demonstrate cloning
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		final int[] Arr1 = {2,4,5,6};
		final int[] Arr2 = {1,2,3,4};
		
		// will generate error - can change its reference to new 
		Arr1 = Arr2 ;
		
		// but we can change elements ( property )
		Arr1[0] = 10;
		Arr2[1] = 12;
	}
}