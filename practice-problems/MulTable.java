// print the multiplication table of number entered by user
// number entered through command line
public class MulTable{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		for( int i = 1 ; i < 11 ; i++ ) 
			System.out.println(num+" * "+i+" = "+(num*i));
	}
}