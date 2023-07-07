// Program to practice the concept of interface in java.
public class Interface2{
	public static void main(String[] args){
		Maruti m1 = new Maruti();
		m1.start(); 
		m1.move();
		m1.getFuel();
		m1,start();
		m1.move();
	}
}
interface Vehicle{
	void start();
	void move(); 
	void getFuel();
}
abstract class Car implements Vehicle{
	public void start(){
		System.out.println("Start it using your keys");
	}
	public void move(){
		System.out.println("Move it using your steering");
	}
}
class Maruti extends Car{
	public void getFuel(){
		System.out.println("Stop at petrol pump");
	}
}