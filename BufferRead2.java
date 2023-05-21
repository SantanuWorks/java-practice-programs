// Using BufferedReader class to take input
// import the buffered reader class
import java.io.* ;
public class BufferRead2{
	public static void main (String args[]) { 
		// BufferedReader only accepts stream of characters 
		// InputStreamReader converts byte stream into character stream
		BufferedReader bf = new BufferedReader( new InputStreamReader(System.in) );
		// handle the exception thrown by BufferedReader 
		// using try catch 
		try{
			System.out.println("Enter your name: ");
			String name = bf.readLine() ; // using object of BufferedReader class, call readLine() which reads a full line 
			System.out.println("Enter your grade: ");
			String grade = bf.readLine() ;
			System.out.print("Your name is "+name+" and your final grade is "+grade);
			bf.close();
		}
		catch ( IOException e ){}
	}
}