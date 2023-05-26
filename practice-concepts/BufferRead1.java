// Using BufferedReader class to take input
// import the buffered reader class
// import java.io.BufferedReader ;
// import java.io.InputStreamReader ;
// import java.io.IOException ;
import java.io.* ;
public class BufferRead1{
	public static void main (String args[]) throws IOException { // handle the exception thrown by BufferedReader
		// BufferedReader only accepts stream of characters 
		// InputStreamReader converts byte stream into character stream
		BufferedReader bf = new BufferedReader( new InputStreamReader(System.in) );
		System.out.println("Enter your name: ");
		String name = bf.readLine() ; // using object of BufferedReader class, call readLine() which reads a full line 
		System.out.println("Enter your grade: ");
		String grade = bf.readLine() ;
		System.out.print("Your name is "+name+" and your final grade is "+grade);
		bf.close();
	}
}