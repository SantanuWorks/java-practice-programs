// Human intelligence can be calculated as i = 2 + ( y + 0.5 * x )
// where x varies from 5.5 to 12.5 (step = 0.5) 
// y varies from 1 to 6 (step = 1)
// find all the posible combination of x, y, i
public class IntelliTable{
	public static void main(String[] args){
		float i ;
		for( int y = 1 ; y < 7 ; y ++ ){
			for( float x = 5.5f ; x <= 12.5f ; x += 0.5f ){
				i = 2 + ( y + 0.5f * x ) ;
				System.out.println(x+" "+y+" "+i);
			}
		}
	}
}