// Program to demonstrate the Methods in java - method overloading
public class Method7{
	public static void main(String[] args){
		Test.sum(1,3); 
		Test.sum(-4.342,232.232);
		Test.sum('1','a');
	}
}
public class Test{
	// static methods can be overloaded
	static void sum(double a,double b){ System.out.println("double type method"); }
	static void sum(int a,int b){ System.out.println("int type method"); }
	static void sum(char a,char b){ System.out.println("char type method"); }
}