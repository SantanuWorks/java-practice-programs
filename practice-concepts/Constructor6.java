// Program to demonstrate various the concept of constructor
// Write a program to add two complex numbers
public class Constructor5{
	public static void main(String[] args){
		Complex a = new Complex(1,3);
		Complex b = new Complex(-1,5);
		a.sum(a,b).show();
	}
}
class Complex{
	int real, img;
	Complex(int real, int img){
		this.real = real;
		this.img = img;
	}
	Complex(Complex c){
		this.real = c.real;
		this.img = c.img;
	}
	Complex sum(Complex a, Complex b){
		Complex c = new Complex(this);
		c.real = a.real + b.real;
		c.img = a.img + b.img;
		return c;
	}
	void show(){
		System.out.println("("+this.real+")+("+this.img+")i");
	}
}