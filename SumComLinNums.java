// program to demonstate the use of fOr-each loop
// it is used to array or collections 
// it sequentially gets each element presenr in array or collection object
// program accepts some integers through the command line and adds them 
public class SumComLinNums{
	public static void main(String[] args){
		// adds all the values entered through the command line
		int intval ;
		int sum = 0 ;
		for(String ech: args){
			intval = Integer.parseInt(ech);
			sum += intval ;
		}
		System.out.print("Sum of entered numbers is "+sum);
	}
}