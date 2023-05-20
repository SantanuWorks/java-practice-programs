// to show the precedence of the operators
// when more than one operators are present in an expression, 
// then precedence plays a role in selecting which operator will execute first
public class Precedence{
	public static void main(String args[]){
		int a = 3, b = 6, c = 4 ;
		int ev1 = a + b * c ; // precedence of * is higher than +
		// b * c will evaluated first
		System.out.println("Evals to "+ev1);
		int ev2 = b / a - c ; // precedence of / is higher than -
		// b / a will evaluated first
		System.out.println("Evals to "+ev2);
		int ev3 = a + b - 12 * a + c ;
		System.out.println("Evals to "+ev3);
		int ev4 = ( a + b ) * c ; // precedence of ( ) is higher than *
		// altough * has higher precedence, but ( ) block will be evaluated first
		// this can be used to prioritise the precedence in an expression
		System.out.print("Evals to "+ev4);
	}
}