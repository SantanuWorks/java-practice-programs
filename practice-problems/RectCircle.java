// length and breadth of a rect is given find area and perimeter
// radius of a circle is given find area and circumference
import java.util.Scanner ;
public class RectCircle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length & breadth of rect: ");
		float len = sc.nextFloat();
		float bre = sc.nextFloat();
		System.out.print("Enter radius of circle: ");
		float rad = sc.nextFloat();
		float rectarea = len * bre ;
		float rectperi = 2 * ( len + bre );
		float circlearea = 3.141f * rad * rad;
		float circlecircum = 2 * 3.141f * rad ;
		System.out.println("Rectangle: Area = "+rectarea+" , Perimeter = "+rectperi);
		System.out.print("Circle: Area = "+circlearea+" , Circumference = "+circlecircum);		
		sc.close();
	}
}