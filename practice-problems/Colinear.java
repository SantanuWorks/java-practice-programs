// program to check if all the three points fall on ome straight line
// condition: (y2 − y1)(x3 − x2) = (y3 − y2)(x2 − x1)
import java.io.*;
public class Colinear{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x1, y1, x2, y2, x3, y3 ;
		int l, r ;
		System.out.print("Enter (x1,y1): ");
		x1 = Integer.parseInt(br.readLine()); y1 = Integer.parseInt(br.readLine());
		System.out.print("Enter (x2,y2): ");
		x2 = Integer.parseInt(br.readLine()); y2 = Integer.parseInt(br.readLine());
		System.out.print("Enter (x3,y3): ");
		x3 = Integer.parseInt(br.readLine()); y3 = Integer.parseInt(br.readLine());
		l = (y2 - y1) * (x3 - x2);
		r = (y3 - y2) * (x2 - x1);
		if ( l == r ) System.out.print("Points fall on one straight line");
		else System.out.print("Points are not on one straight line");
		br.close();
	}
}