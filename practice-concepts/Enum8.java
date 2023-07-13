// Program to demonstrate the concept of Enumeration or Java Enum - values(), loop and array 
public class Enum8{
	enum Day{
		MON, TUE, WED, THU, FRI, SAT, SUN;
	}
	public static void main(String[] args){
		// Use loop to access all the constants of an enum
		// using for-each loop
		for( Day d: Day.values() ){
			System.out.println("Today is "+d);
		}
	
		System.out.println();
		
		// We can store all the constants in an array of same enum type 
		// using values() method
		Day days[] = Day.values();
		for( int i = 0; i < days.length; i++ ) System.out.println("Today is "+days[i]);
	}
}