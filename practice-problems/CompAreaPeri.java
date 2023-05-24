// program to compare area and perimeter of a rectangle
// input through command line
public class CompAreaPeri{
	public static void main(String[] args){
		int l = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int peri = 2 * ( l + b );
		int area = l * b;
		if( area > peri ) System.out.print("Area is greater than perimeter");
		else if( area < peri ) System.out.print("Area is less than perimeter");
		else System.out.print("Area and perimeter are same");
	}
}