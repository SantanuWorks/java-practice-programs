// Program to demonstrate the Methods in java - method overloading
public class Method4{
	public static void main(String[] args){
		Calc cl = new Calc();
		System.out.println(2+" + "+4+" = "+cl.sum(2,4));
		System.out.println(3.21f+" + "+9.34f+" = "+cl.sum(3.21f,9.34f));
		System.out.println(2.22+" + "+3.21+" = "+cl.sum(2.22,3.21));
	}
}
public class Calc{
	// methods with same name but different signature
	public int sum(int a, int b){ return a+b; }
	public float sum(float a, float b){ return a+b; }
	public double sum(double a, double b){ return a+b; }
}