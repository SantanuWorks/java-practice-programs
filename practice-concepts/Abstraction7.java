// Program to demonstrate the concept of abstraction
public class Abstraction7{
	public static void main(String[] args){
		Aa a = new Aa();
		a.mA();
		Aa.Bb b = a.new Bb();
		b.mB();
	}
}
// both top-level(Outer) & inner class can be abstract
abstract class A{
	abstract void mA();
	abstract class B{
		abstract void mB();
	};
}
class Aa extends A{
	void mA(){ System.out.println("A"); }
	class Bb extends B{
		void mB(){ System.out.println("B"); }
	};
}