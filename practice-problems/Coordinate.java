// convert the cartesian coordinates (x,y) into polar coordinates (r,q)
// r = sqrt(x^2+y^2), q = tan^-1(y/x)
// coordinates input through command line
public class Coordinate{
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double r = Math.sqrt( x*x + y*y ) ;
		double q = Math.atan( y/x ) ;
		System.out.print("Polar Coordinates: r = "+r+" , q = "+q);
	}
}  