// Program to demonstrate the OOP concepts - encapsulation
import java.io.*;
public class Oops4{
	public static void main(String[] args) throws IOException{
		Test t = new Test();
		t.login();
	}
}
class Test{
	private String password;
	private String username;
	private void get(){
		Console csol = System.console();
		username = csol.readLine("Enter your username: ");
		password = String.valueOf(csol.readPassword("Enter your password: "));
	}
	private void set(){
		if( username.equals("ram") ){
			if( password.equals("123") ) System.out.print("login successful!");
			else System.out.print("incorrect password!");
		}else System.out.print("incorrect username!");
	}
	public void login(){ get(); set(); }
}