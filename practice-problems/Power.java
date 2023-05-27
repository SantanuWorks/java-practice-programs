// find the value raise to the power of another
// Enter the base and power through the command line interface
public class Power{
	public static void main(String[] args){
		int base = Integer.parseInt(args[0]);
		int power = Integer.parseInt(args[1]);
		long val = 1 ;
		for( int i = 0 ; i < power ; i ++  ) val *= base ;
		System.out.print(base+" raise to "+power+" is "+val);
	}
}