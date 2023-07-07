// Program to practice the concept of interface in java.
public class Interface7{
	public static void main(String[] args){
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3(); 
	}
}
// interfaces can be extended - one interface can extend one or more interfaces
interface A{
	void m1();
}
interface B{
	void m2();
}
interface C extends A,B{
	void m3();
}
// one class can extend multiple interfaces
class Test implements C{
	public void m1(){
		System.out.println("m1()");
	}
	public void m2(){
		System.out.println("m2()");
	}
	public void m3(){
		System.out.println("m3()");
	}
}