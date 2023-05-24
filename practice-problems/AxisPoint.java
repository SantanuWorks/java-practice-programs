// program to check whether a point lies on x-axis, y-axis or on the origin
import java.util.Scanner ;
public class AxisPoint{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y ;
		System.out.print("Enter point (x,y): ");
		x = sc.nextInt();
		y = sc.nextInt();
		if( x == 0 && y == 0 ) System.out.print("Point lies on origin");
		else if( x == 0 ) System.out.print("Point lies on y-axis");
		else if( y == 0 ) System.out.print("Point lies on x-axis");
		else System.out.print("Point doesn't lie on any axis or origin");
	}
}