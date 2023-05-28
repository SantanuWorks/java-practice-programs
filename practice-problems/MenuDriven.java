// Menu driven program with following options 
// 1. Factorial
// 2. Prime or not
// 3. Odd or Even
// 4. Exit
import java.io.*;
public class MenuDriven{
	public static void main(String[] args) throws IOException{
		byte op ;
		long f = 1 ;
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.print("1. Factorial\n2. Prime or not\n3. Even or odd\n4. Exit\nChoose any one: ");
			op = Byte.parseByte(br.readLine());
			switch(op){
				case 1: System.out.print("Enter the number: "); 
						n = Integer.parseInt(br.readLine());
						for( int i = 2 ; i <= n ; i++ ) f *= i ;
						if( n == 1 || n == 0 ) f = 1;
						System.out.println("Factorial of "+n+" is "+f);
						f = 1;
						break;
				case 2: System.out.print("Enter the number: "); 
						n = Integer.parseInt(br.readLine());
						boolean fla = false ;
						for( int i = 2 ; i < n ; i++ ) if( n % i == 0 ){ fla = true ; break; }
						if( n == 1 || n == 0 ) fla = true;
						if( !fla ) System.out.println(n+" is prime!");
						else System.out.println(n+" is not prime!");
						break;
				case 3: System.out.print("Enter the number: "); 
						n = Integer.parseInt(br.readLine());
						if( n % 2 == 0 ) System.out.println(n+" is even!");
						else System.out.println(n+" is odd!");
						break;
				case 4: System.out.print("Exited!"); br.close(); return;
				default: System.out.println("Incorrect option!"); continue;
			}
		}
		while( true );
	}
}