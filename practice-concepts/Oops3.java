// Program to demonstrate the OOP concepts - this operator
public class Oops3{
	private int a ;
	public Oops3(){  
		this(112);
	}
	public Oops3(int a){  
		this.a = a ;
	}
	public Oops3 currInst(){
		return this ;
	}
	public void display(Oops3 t){
		System.out.println("Your code is " + t.a);
	}
	public static void main(String[] args){
		Oops3 t = new Oops3();
		t.display(t);
		Oops3 o = t.currInst();
		o.display(o);
		// can not be used from a static context
		// this.a = 222 ;
	}
}