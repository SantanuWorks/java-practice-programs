// find all combination of 1, 2 and 3
public class Combination{
	public static void main(String[] args){
		for( int i = 1 ; i < 4 ; i ++ )
			for( int j = 1 ; j < 4 ; j ++ )
				for( int k = 1 ; k < 4 ; k ++ )
					System.out.println(i+" "+j+" "+k);
	}
}