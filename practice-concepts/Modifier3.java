// Program to demonstrate the concept of Access Modifiers - private
// accessible to class itself only
public class Modifier3{
	public static void main(String[] args){
		// we can create object of Test
		Test t = new Test();
		System.out.println("Accessing property 'name' => "+t.name);
		System.out.print("Accessing property 'no' => "+t.no);
	}
}
public class Test{
	private String name = "test";
	private int no = 1;
}