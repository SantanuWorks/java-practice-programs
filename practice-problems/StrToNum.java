// Program to demonstrate various String class methods
public class StrToNum{
	public static void main(String[] args){
		String str = "897999789079800345345";
		int digit = 0 ; long num = 0 ;
		for( int i = 0 ; i < str.length() ; i ++ ){
			switch(str.charAt(i)){
				case '0': digit = 0 ; break ;
				case '1': digit = 1 ; break ;
				case '2': digit = 2 ; break ;
				case '3': digit = 3 ; break ;
				case '4': digit = 4 ; break ;
				case '5': digit = 5 ; break ;
				case '6': digit = 6 ; break ;
				case '7': digit = 7 ; break ;
				case '8': digit = 8 ; break ;
				case '9': digit = 9 ; break ;
			}
			num = num * 10 + digit ;
		}
		System.out.print(num) ;
	}
}