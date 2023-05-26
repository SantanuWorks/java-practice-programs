// program to demonstrate the for loop 
// to show the possible infinite for loops
public class For3{
	public static void main(String[] args){
		// ways of infinite loop
		// condition is skipped 
		for( int i = 1 ; ; i++ ){
			System.out.print(i+" ");
		}
		// everything is skipped 
		for( ; ; ){
			System.out.print("I'm infinite");
		}
		// condition always true 
		for( int i = 1 ; i  > 0 ; i++ ){
			System.out.print(i+"'s infinite");
		}
	}
}