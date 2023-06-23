// Program to demonstrate the OOP concepts - method overloading ways
public class Oops4{
	public static void main(String[] args){
	}
}
class Test{
	// original method
	void sum(int a,int b){}
	
	// changing no of parameters
	void sum(int a,int b,int c){}
	
	// changing type of parameters
	void sum(float a,float b){}
	
	// changing order of parameters
	void sum(int a,float b){}
	void sum(float a,int b){}
	// void sum(int b,int a){} --> won't work
	
	// or we can combine all three
	void sum(int a,float b,int c){}
	void sum(int a,float b,float c,int d){}
}