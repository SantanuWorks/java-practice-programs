// Program to demonstrate the concept of Enumeration or Java Enum - Switch
public class Enum6{
	enum Day{
		MON, TUE, WED, THU, FRI, SAT, SUN;
	}
	public static void main(String[] args){
		// Enum constants can be passed as agrument to the switch-case
		Day d = Day.WED;
		switch(d){
			case MON: System.out.print("It is Monday!"); break;
			case TUE: System.out.print("It is Tuesday!"); break;
			case WED: System.out.print("It is Wednesday!"); break;
			case THU: System.out.print("It is Thursday!"); break;
			case FRI: System.out.print("It is Friday!"); break;
			case SAT: System.out.print("It is Saturday!"); break;
			case SUN: System.out.print("It is Sunday!"); break;
		}
	}
}