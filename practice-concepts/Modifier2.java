// Program to demonstrate the concept of Access Modifiers - protected
// accessible to child and non-child same package
// accessible to child and non-child same package
public class Modifier2{
	public static void main(String[] args){
		// we can create object of Test
		Test t = new Test();
		System.out.println("Accessing property 'name' => "+t.name);
		System.out.println("Accessing property 'no' => "+t.no);
		
		Best b = new Best();
		Test b1 = new Best();
		System.out.println("Accessing property 'name' => "+b.name);
		System.out.println("Accessing property 'no' => "+b.no);
		System.out.println("Accessing property 'name' => "+b1.name);
		System.out.print("Accessing property 'no' => "+b1.no);
	}
}
public class Test{
	protected String name = "test";
	protected int no = 1;
}
public class Best extends Test{
	protected String name = "best";
	protected int no = 2; 
}