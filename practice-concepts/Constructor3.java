// Program to demonstrate various the concept of constructor - constructor overloading
public class Constructor3{
	public static void main(String[] args){
		A a = new A(12,4);
		A b = new A(4.2,39.99);
		A c = new A("Harish",498);
	}
}
class A{
	A(int a, int b){
		System.out.println("Age = "+a+", Class = "+b);
	}
	A(double a, double b){
		System.out.println("Height = "+a+", Weight = "+b);
	}
	A(String a, int b){
		System.out.print("Name = "+a+", Marks = "+b);
	}
}