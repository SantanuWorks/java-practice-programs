// ISBN is a  10 digit number. Right most digit is the checksome calculated 
// using remaining 9 digits with the following condition
// d1 + 2d2 + 3d3 + ... + 10d10 must be divisible by 11 and d10 is the checksome
// d10 can be 0-10
// Write a program to accpet a ISBN number and validate its correctness
// Enter ISBN through command line
public class Isbn{
	public static void main(String[] args){
		String isbn = args[0] ;
		int sum = 0 ;
		if( isbn.length() != 10 ){ System.out.print(isbn + " is invalid");return; }
		for(int i = 0 ; i < isbn.length() ; i ++) sum += ((isbn.charAt(i)-48)*(i+1));
		if( sum % 11 == 0 ) System.out.print(isbn + " is valid");
		else System.out.print(isbn + " is invalid");
	}
}