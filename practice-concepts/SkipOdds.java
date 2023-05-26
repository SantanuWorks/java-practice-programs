// program to demonstrate the continue statement
// program to skip odd numbers between a and b ( inclusive and a <= b )
// user input a nd b through command line
public class SkipOdds{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		for( int i = a ; i <= b ; i ++ ){
			if( i % 2 == 1 ) continue;
			System.out.print(i+" ");
		}
	}
}