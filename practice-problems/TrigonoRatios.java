// find the trigonometric ratios if value of an angle is given
import java.util.Scanner ;
public class TrigonoRatios{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double angle ;
		double sin, cos, tan, cot, sec, cosec ;
		System.out.print("Enter value of an angle: ");
		angle = sc.nextDouble();
		sin = Math.sin(angle) ;
		cos = Math.cos(angle) ;
		tan = Math.tan(angle) ;
		cot = 1 / tan ;
		sec =  1 / cos ;
		cosec = 1 / sin ;
		System.out.println("sin("+angle+") = "+sin);
		System.out.println("cos("+angle+") = "+cos);
		System.out.println("tan("+angle+") = "+tan);
		System.out.println("cot("+angle+") = "+cot);
		System.out.println("sec("+angle+") = "+sec);
		System.out.print("cosec("+angle+") = "+cosec);
	}
}