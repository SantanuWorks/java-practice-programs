// Find the area of a triangle when three sides are given
// input through command line
public class TriangleArea{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double s = (a + b + c) / 2.0f ;
		double A = s*(s-a)*(s-b)*(s-c);
		double Area = Math.sqrt(A);
		System.out.print("Area of the triangle is "+Area);
	}
}