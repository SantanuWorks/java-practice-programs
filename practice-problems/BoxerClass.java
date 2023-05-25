// find weight class of a boxer as per the following table
// Flyweight < 115
// Bantamweight 115-121
// Featherweight 122-153
// Middleweight 154-189
// Heavyweight >= 190
// input through command line
public class BoxerClass{
	public static void main(String[] args){
		int weight = Integer.parseInt(args[0]);
		if( weight < 115 ) System.out.print("Flyweight");
		else if( weight <= 121 && weight >= 115 ) System.out.print("Bantamweight");
		else if( weight <= 153 && weight >= 122 ) System.out.print("Featherweight");
		else if( weight <= 189 && weight >= 154 ) System.out.print("Middleweight");
		else if( weight >= 190 ) System.out.print("Heavyweight");
	}
}