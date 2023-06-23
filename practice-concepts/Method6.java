// Program to demonstrate the Methods in java - method overloading
public class Method6{
	public static void main(String[] args){
		Test t = new Test();
		t.sum(1,3); // args are of int type - compiler will search for compatible higher type 
	}
}
public class Test{
	// type conversion ( lower to higher ) happens if prototype doesnot matches
	void sum(double a,double b){ System.out.println("double type method"); } // if long & float not present then this
	void sum(float a,float b){ System.out.println("float type method"); } // if long not present then this
	void sum(long a,long b){ System.out.println("long type method"); } // this will be compatible family and higher type
	void sum(char a,char b){ System.out.println("long type method"); }
}