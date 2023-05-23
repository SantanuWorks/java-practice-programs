// Program to demonstrate the switch case structure
public class SwitchCase1{
	public static void main(String[] args){
		int a = 1 ; // int literal
		switch(a){ // expression evaluate to int
			case 0: System.out.print("a = 0"); break;
			case 1: System.out.print("a = 1"); break;
			case 2: System.out.print("a = 2"); break;
			case 3: System.out.print("a = 3"); break;
			// It is option and can be anywhere in the switch 
			default: System.out.print("Other a");
		}
	}
}