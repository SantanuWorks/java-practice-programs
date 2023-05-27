// print all the ASCII values and their equivalent characters
public class Ascii{
	public static void main(String[] args){
		for( char i = 0 ; i < 256 ; i ++ ){
			System.out.println((int)i+" -> "+i);
		}
	}
}