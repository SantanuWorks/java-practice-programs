// find greatest among three numbers
// degree to radian => deg*3.141/180
// Enter the numbers through command line
public class Greatest{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if( a >= b && a >= c ) System.out.print(a+" is greatest among them");
		else if( b >= a && b >= c ) System.out.print(b+" is greatest among them");
		else System.out.print(c+" is greatest among them");
	}
}