// Program to demonstrate use of array
public class Array4{
	public static void main(String[] args){
		// Below arrays are initialized with their default values
		int[] arr1 = new int[5];
		float[] arr2 = new float[5];
		char[] arr3 = new char[5];
		boolean[] arr4 = new boolean[5];
		String[] arr5 = new String[5];
		
		// Printing default values of array
		System.out.print("int array default values are ");
		for( int a:arr1 ) System.out.print(a+" ");
		System.out.println();
		System.out.print("float array default values are ");
		for( float a:arr2 ) System.out.print(a+" ");
		System.out.println();	
		System.out.print("char array default values are ");
		for( char a:arr3 ) System.out.print("'"+a+"' ");
		System.out.println();	
		System.out.print("boolean array default values are ");
		for( boolean a:arr4 ) System.out.print(a+" ");
		System.out.println();
		System.out.print("string array default values are ");
		for( String a:arr5 ) System.out.print(a+" ");	
		// since String is a class and its values are objects 
		// default values for objects are null
	}
}