// program to demonstrate the break statement
public class Break1{
	public static void main(String[] args){
		// terminate a loop
		for( int i = 0 ; i < 6 ; i ++ ){
			if( i == 3 ) // terminate the loop
			System.out.print("It is "+i);
		}
	}
}