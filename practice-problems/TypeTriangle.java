// program to check whether a triangle is valid or not 
// if sum of two side is greater than the third then triangle is valid
// input through command line
public class Leap{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if( !((a+b)>c && (a+c)>b && (c+b)>a) ) System.out.print("It is not a triangle");
		else if( a==b && b==c  ) System.out.print("It is an equilateral triangle");
		else if( a==b || b==c || a==c ) System.out.print("It is an isoscales triangle");
		else if( (a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a) ) System.out.print("It is an right angled triangle");
		else System.out.print("It is an scelene triangle");
	}
}