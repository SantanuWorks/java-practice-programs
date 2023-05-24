// program take three angles of an triangle and checks whether it is valid or not
// triangle is valid if sum of three angles is 180
// input through the command line
public class ValidTriangle{
	public static void main(String[] args){
		short a = Short.parseShort(args[0]);
		short b = Short.parseShort(args[1]);
		short c = Short.parseShort(args[2]);
		if( (a+b+c) == 180 ) System.out.print("Triangle is valid!");
		else System.out.print("Triangle is valid!");
	}
}