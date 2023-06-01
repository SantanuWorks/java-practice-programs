// program to demonstrate the property of immuatability
public class StringCreate{
	public static void main(String[] args){
		// string declared
		String str = "Computer";
		System.out.println(str);
		// trying to change the str
		str.concat(" Networking"); // method is used to add a string to the next of existing string
		// instead of changing...it will create a new object with value "Computer Networking"
		System.out.println(str.concat(" Networking")); // since str does not have reference to "Computer Networking"
		// force the reference
	    str = str.concat(" Networking");
		System.out.print(str);
	}
}