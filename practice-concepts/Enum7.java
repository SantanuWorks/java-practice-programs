// Program to demonstrate the concept of Enumeration or Java Enum - Abstract Methods 
public class Enum7{
	public static void main(String[] args){
		Eno o = Eno.A;
		o.display();
		o = Eno.B;
		o.display();
		o = Eno.C;
		o.display();
	}
}
// Enum can contain abstreact methods, but it should be implemented by all its constants
enum Eno{
	A{ public void display(){ System.out.println("Constant A"); } },
	B{ public void display(){ System.out.println("Constant B"); } },
	C{ public void display(){ System.out.print("Constant C"); } };
	abstract void display();
}