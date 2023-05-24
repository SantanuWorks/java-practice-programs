// program to demonstrate the for loop 
// asks the user a and b through command line
// adds all the even and odd numbers between a to b ( inclusive n a < b )
public class SumEvenOdd{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sumeven = 0, sumodd = 0 ;
		for(int i = a ; i <= b ; i ++){
			if( i % 2 == 0 ) sumeven += i ;
			else sumodd += i ;
		}
		System.out.println("Sum of even numbers between "+a+" and "+b+" is "+sumeven);
		System.out.print("Sum of odd numbers between "+a+" and "+b+" is "+sumodd);
	}
}