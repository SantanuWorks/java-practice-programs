// program to demonstrate swtich case handling different types of contant 
// integers ( char, byte, short, int, long ), string, enum 
// floating and boolean types are not allowed
public class SwitchCase2{
	public static void main(String[] args){
		// expression type and case type should match
		char ch = 'C' ;
		switch(ch){
			case 'A': System.out.print("Apple");break;
			case 'B': System.out.print("Ball");break;
			case 'C': System.out.print("Cat");break;
		}
		System.out.println();
		String st = "Ram" ;
		switch(st){
			case "Hari": System.out.print("He is Hari");break;
			case "Ram": System.out.print("He is Ram");break;
			case "Gopal": System.out.print("He is Gopal");break;
		}
	}
}