// Write a program to that generates and prints the fibonacci words of order 0 
// through n. if f(0) = "A", f(1) = "B", f(2) = "BA", f(3) = "BAB", f(4) = "BABBA"
// Enter n through command line
public class FiboWord{
	public static void main(String[] args){
		String A = "A", B = "B", TEMP ;
		int n = Integer.parseInt(args[0]);
		n -= 2 ;
		System.out.print("Fibonacci Words: ");
		System.out.print(A+" "+B+" ");
		for(int i = 0; i < n ; i ++ ){
			TEMP = B ;
			B = B + A ;
			A = TEMP ;
			System.out.print(B+" ");
		}
	}
}