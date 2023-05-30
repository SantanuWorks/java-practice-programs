// Write a program to print 
// 
// A B C D E F G F E D C B A
// A B C D E F   F E D C B A
// A B C D E       E D C B A
// A B C D           D C B A
// A B C               C B A
// A B                   B A
// A                       A
// 
public class Pattern2{
	public static void main(String[] args){
		char ch = 'A' ;
		int steps = 26 ;
		int space = -1 ;
		int f = 0 ;
		for( int i = 0 ; i < steps ; i ++ ){
			for( int j = 0 ; j < steps - i ; j ++, ch++ ) System.out.print(ch+" ");
			for( int j = 0 ; j < space ; j ++ ) System.out.print("  ");
			ch--;
			if( i == 0 ){ f = 1 ; ch-- ; } 
			for( int j = 0 ; j < steps - f - i ; j ++, ch-- ) System.out.print(ch+" ");
			ch = 'A';
			space += 2 ;
			f = 0 ;
			System.out.println();
		}
	}
}