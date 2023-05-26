// program to demonstrate the for loop 
// asks the user a and b through command line
// adds all the numbers between a to b ( inclusive n a < b )
public class UserInputSumFor{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = 0 ;
		for(int i = a ; i <= b ; i ++){
			sum += i ;
		}
		System.out.print("Sum of numbers between "+a+" and "+b+" is "+sum);
	}
}