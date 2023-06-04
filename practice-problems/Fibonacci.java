// Program to find first n fibonacci terms 
// Enter n through command line
public class Fibonacci{
	public static void main(String[] args){
		int a = 1, b = 1 ; int temp ;
		int n = Integer.parseInt(args[0]);
		n -= 2 ;
		System.out.print("Fibonacci Series: ");
		System.out.print(a+" "+b+" ");
		for(int i = 0; i < n ; i ++ ){
			temp = b ;
			b = a + b ;
			a = temp ;
			System.out.print(b+" ");
		}
	}
}