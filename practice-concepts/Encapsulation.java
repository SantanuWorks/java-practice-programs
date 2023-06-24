// Program to demonstrate the concept of encapsulation
public class Encapsulation{
	public static void main(String[] args){
		Test t = new Test();
		t.getter("mrcyber");
		t.setter();
	}
}
class Test{
	private String username;
	public void getter(String un){
		username = un;
	}
	public void setter(){
		System.out.print("Your username is "+username);
	}
}