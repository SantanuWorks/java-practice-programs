// Program to practice the concept of interface in java.
public class Interface1{
	public static void main(String[] args){
		User u1 = new User("mrcyber");
		u1.startGame();
		u1.playGame();
		u1.endGame();
	}
}
// it provides 100% abstraction
interface Player{
	// it is public static final bydefault
	int playerID = 111111;
	public static final int gameRef = 12422;
	// below are abstract methods bydefault
	void startGame();
	void playGame();
	void endGame();
}
class User implements Player{
	// implementing class must implement all the methods 
	// otherwise it should be declared as abstract too
	String name;
	User(String name){ this.name = name; }
	public void startGame(){
		System.out.println(name+" has started the game");
	}
	public void playGame(){
		System.out.println(name+" is playing the game");
	}
	public void endGame(){
		System.out.println(name+" has ended the game");
	}
}