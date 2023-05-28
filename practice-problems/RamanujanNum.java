// Ramanujan number is the smallest number that can be expressed as sum of two cubes in two different ways 
// Write a program to print such numbers up to a certain limit
// NOT AN OPTIMIZED PROGRAM
public class RamanujanNum{
	public static void main(String[] args){
		int limit = 25 ;
		for( int i = 1 ; i <= limit ; i ++ ){
			for( int j = 1 ; j <= limit ; j ++ ){
				for( int k = 1 ; k <= limit ; k ++ ){
					for( int l = 1 ; l <= limit ; l ++ ){ 
					    if( i == j && j == k && k == l && l == i ) continue;
						if( (i == k && j == l) || ( i == l && j == k ) ) continue;
						if( i*i*i + j*j*j == k*k*k + l*l*l ) System.out.println(i*i*i + j*j*j);
					}
				}	
			}
		}	
	}
}