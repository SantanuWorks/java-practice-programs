// scope of a variable defines variables life span and accessibility area 
// scope in Java is defined by {}; there is no global scole in java
// every variable is inside a {} block
public class Scope1{
	int a ; // this varible has class level scope; won't be access outside class
	// variable inside a method has local scope 
	// outside the method variable doesn't exist
	// variable destroyed after the end of the method execution
	public static void main( String args[] ){
		int a = 10 ; // method scope
		System.out.print("Local to main(); a = "+a);
	}
	public void outside(){
		// this will produce error when executed
		// System.out.print("unable to access 'a'"+a);
	}
}