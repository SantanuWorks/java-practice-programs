// command-line argument 
public class CommandLine{
	public static void main(String args[]){
		// args[] stores the input entered at command line 
		// it is a array string 
		System.out.println("String: "+args[0]);
		System.out.println("char: "+args[1].charAt(0)); // extracting the char
		System.out.println("Int: "+Integer.parseInt(args[2])); // parsing to int
		System.out.print("Float: "+Float.parseFloat(args[3])); // parsing to float
	}
}