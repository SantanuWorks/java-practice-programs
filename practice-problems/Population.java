// Population of a town today is 100000. The population has increased steadily at the rate of 10% per year for last 10 years
// Write a program to determine the population at the end of each year in the last decade. 
public class Population{
	public static void main(String[] args){
		int p;
		for( int i = 1 ; i <= 10 ; i ++ ){
			p = (int)(100000 / ( Math.pow( 1.1, i ))) ;
			System.out.println("Population "+i+" years ago was "+p);
		}	
	}
}