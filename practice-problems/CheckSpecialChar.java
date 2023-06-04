// Check special numbers present in string or not if present count
import java.io.* ;
public class CheckSpecialChar{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string: ");
		String str = br.readLine();
		byte c = 0 ;
		for( int i = 0 ; i < str.length() ; i++ ){
			if((str.charAt(i)>=0&&str.charAt(i)<=47)||
			(str.charAt(i)>=58&&str.charAt(i)<=64)||
			(str.charAt(i)>=91&&str.charAt(i)<=96)||
			(str.charAt(i)>=123&&str.charAt(i)<=127)){
				c ++ ;
			}
		}
		if( c == 0 ) System.out.print("No special characters are present.");
		else  System.out.print(c+" special characters are present.");
		br.close();
	}
}