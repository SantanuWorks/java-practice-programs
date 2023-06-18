// Program to demonstrate the concept of Access Modifiers - public
// accessible everywhere 
public class Modifier1{
	public static void main(String[] args){
		// we can create object of Test
		Test t = new Test();
		System.out.println("Accessing property 'name' => "+t.name);
		System.out.print("Accessing property 'no' => "+t.no);
	}
}
public class Test{
	public String name = "test";
	public int no = 1;
}