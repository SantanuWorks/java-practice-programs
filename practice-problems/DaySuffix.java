// Write a program to print 24 hours of day with suitable suffixes likw AM,PM,Noon and Midnight. 
public class DaySuffix{
	public static void main(String[] args){
		for( int h = 0 ; h < 24 ; h++ ){
			if( h == 0 ) System.out.println("12 Midnight");
			else if( h == 12 ) System.out.println("12 Noon");
			else if( h > 12 ) System.out.println(h+" PM");
			else if( h < 12 ) System.out.println(h+" AM");
		}
	}
}