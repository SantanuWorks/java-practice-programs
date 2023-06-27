// Program to demonstrate the OOP concepts - inheritance
public class Oops9{
	public static void main(String[] args){
		Sub s = new Sub();
		s.disply();
		System.out.println("SupVar = "+s.supVar);
		s.show();
	}
}
class Sup{
	int supVar = 10;
	void disply(){ System.out.println("Its Super Class"); }
}
class Sub extends Sup{
	int subVar = 12;
	void show(){ System.out.println("Its Sub Class"); }
}