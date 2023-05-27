// Write a program for a matchstick game being played between the computer and a user.
// Your program should enusure that the computer always wins. Rules are the following:
// There are 21 matchsticks
// The computer asks the user to pick 1,2,3,or 4 matchsticks
// After the persion picks, the computer does its picking 
// Whoever is forced to pick up the last matchstick losses the game
import java.io.*;
public class MatchStickGame{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 21 ;
		int userpick, comppick;
		do{
			System.out.println("No of matchsticks left: "+total);
			System.out.print("Pick your matchsticks: ");
			userpick = Integer.parseInt(br.readLine());
			if( userpick > 4 || userpick < 1 ){ System.out.println("Wrong pick!!"); continue; }
 			total -= userpick ;
			if( total == 1 ){ System.out.print("You won!!"); break; }
			System.out.println("No of matchsticks left: "+total);
			System.out.println("Computer is picking...");
			comppick = 5 - userpick ;
			total -= comppick ;
			if( total == 1 ){ System.out.print("Computer won!! Better luck next time"); break; }
		}
		while(true);
		br.close();
	}
}