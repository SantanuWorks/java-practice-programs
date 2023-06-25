// Program to demonstrate the OOP concepts - constructor
public class Oops8{
	public static void main(String[] args){
		A a = new A();
		a.display();
		System.out.println();
		a = new A("Rajesh",12);
		a.display();
	}
}
class A{
	int id;
	String name;
	A(){
		id = 0;
		name = null;
	}
	A( String name,int id){
		this.id = id;
		this.name = name;
	}
	void display(){
		System.out.print("Your name is "+name+"\nYour generic id is "+id);
	}
}