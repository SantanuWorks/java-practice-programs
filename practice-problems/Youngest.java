// program to find the youngest age among three 
// input through command line
public class Youngest{
	public static void main(String[] args){
		byte ram = Byte.parseByte(args[0]);
		byte shyam = Byte.parseByte(args[1]);
		byte ajay = Byte.parseByte(args[2]);
		if( ram < shyam && ram < ajay ) System.out.print("Ram is the youngest!");
		else if( shyam < ram && shyam < ajay ) System.out.print("Shyam is the youngest!");
		else System.out.print("Ajay is the youngest!");
	}
}