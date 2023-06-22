// Program to demonstrate the concept of abstraction
public class Abstraction9{
	public static void main(String[] args){
		Square sq = new Square(32);
		sq.area();
		sq.perimeter();
		Rectangle rc = new Rectangle(22,42);
		rc.area();
		rc.perimeter();
		Circle cr = new Circle(15);
		cr.area();
		cr.perimeter();
	}
}
abstract class Shape{
	abstract void area();
	abstract void perimeter();
}
class Square extends Shape{
	int side;
	Square(int side){ this.side = side; }
	void area(){
		System.out.println("Area is "+(side*side));
	}
	void perimeter(){
		System.out.println("Perimeter is "+(4*side));
	}
}
class Rectangle extends Shape{
	int length, width;
	Rectangle(int length, int width){ this.length = length; this.width = width; }
	void area(){
		System.out.println("Area is "+(length*width));
	}
	void perimeter(){
		System.out.println("Perimeter is "+(2*(width+length)));
	}
}
class Circle extends Shape{
	int radius;
	Circle(int radius){ this.radius = radius; }
	void area(){
		System.out.println("Area is "+(3.141f*radius*radius));
	}
	void perimeter(){
		System.out.println("Perimeter is "+(6.282f*radius));
	}
}