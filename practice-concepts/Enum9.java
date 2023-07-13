// Program to demonstrate the concept of Enumeration or Java Enum - ordinal() and valueOf()
public class Enum9{
	enum Day{
		MON, TUE, WED, THU, FRI, SAT, SUN;
	}
	public static void main(String[] args){
		// TO find index of an constant in an enum
		// We can use cardinal() method
		for( Day d: Day.values() ){
			System.out.println(d+" is at "+d.ordinal());
		}
		// valueOf() can return the enum object representing the string value
		String strDay[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		System.out.print("\nDays of a week are ");
		for( String day: strDay ) System.out.print(Day.valueOf(day)+" "); 
	}
}