// check whether sum of square of sine and cosine of a degree value is 1 or not
// degree to radian => deg*3.141/180
// Enter the degree value through command line
public class sumSinCos{
	public static void main(String[] args){
		double deg = Double.parseDouble(args[0]);
		double rad = deg*(3.141f / 180);
		double cos = Math.cos(rad) ;
		double sin = Math.sin(rad) ;
		double sum = cos*cos + sin*sin ;
		System.out.print(Math.ceil(sum));
	}
}