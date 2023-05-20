public class Associativity{
	public static void main(String args[]){
		int a = 3, b = 5, c = 6 ;
		int ev1, ev2, ev3, ev4, ev5 ;
		ev1 = a + b - c ; // associativity left to right; left operator will evaluate first then right
		ev2 = a * b / c ; // associativity left to right; left operator will evaluate first then right
		ev3 = b / a * c ; // associativity left to right; left operator will evaluate first then right
		ev4 = a + b - c * a / b ; // (*)>(/)>(+)>(-)
		ev5 = a++ - --b;
		System.out.println("Evals to "+ev1);
		System.out.println("Evals to "+ev2);
		System.out.println("Evals to "+ev3);
		System.out.println("Evals to "+ev4);
		System.out.println("Evals to "+ev5);
	}
}