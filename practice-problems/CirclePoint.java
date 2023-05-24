// program to test whether a point is inside, outside or on the circle
// equation of circle: (x - h)^2+ (y - k)^2 = r^2
import java.io.*;
public class CirclePoint{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x, y, h, k;
		int r, l ;
		System.out.print("Enter center (h,k): ");
		h = Integer.parseInt(br.readLine()); k = Integer.parseInt(br.readLine());
		System.out.print("Enter radius: ");
		r = Integer.parseInt(br.readLine()); 
		System.out.print("Enter point (x,y): ");
		x = Integer.parseInt(br.readLine()); y = Integer.parseInt(br.readLine());
		l = (x - h)*(x - h) + (y - k)*(y - k) - r*r ;
		if( l == 0 ) System.out.print("( "+x+" , "+y+" ) lies on the circle");
		else if( l < 0 ) System.out.print("( "+x+" , "+y+" ) lies inside the circle");
		else System.out.print("( "+x+" , "+y+" ) lies outside the circle");
		br.close();
	}
}