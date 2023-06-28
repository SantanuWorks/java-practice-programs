// Write a Program to find area of circle, triangle and rectangle using function overloading
public class Oops1{
	public static void main(String[] args){
		ShapeArea sa = new ShapeArea();
		sa.display("Circle", sa.area(6));
		sa.display("Rectangle", sa.area(4,2));
		sa.display("Triangle", sa.area(2,3,4));
	}
}
class ShapeArea{
	double area(int a, int b, int c){
		double s = (a+b+c)/2.0;
		double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return ar;
	}
	double area(int rad){
		return (22*rad*rad/7);
	}
	int area(int len, int wid){
		return (len*wid);
	}
	void display(String shape, double area){
		System.out.println(shape+" has area of "+area+" sq. unit");
	}
}