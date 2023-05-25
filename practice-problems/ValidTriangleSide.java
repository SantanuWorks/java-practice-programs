// program to check whether a triangle is valid or not 
// if sum of two side is greater than the third then triangle is valid
// input through command line
public class ValidTriangleSide{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if( (a+b)>c && (b+c)>a && (a+c)>b ) System.out.print("It is a valid trianlge");
		else System.out.print("It is not a valid trianlge");
	}
}