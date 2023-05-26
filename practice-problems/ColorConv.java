// In digital world colors are specified in Red Green Blue ( RGB ) format, with values of R, G, B varying 
// on an integer scale from 0 to 255. In the print publishing the colors are mentioned in Cyan-Magenta-Yellow-Black(CMYK)
// format, with values of C,M,Y,and K varying on a real scale from 0.0 to 1.0. Write a program to convert RGB to CMYK.
// White = max( Red/255, Green/255, Blue/255 )
// Cyan = (White - Red/255)/White
// Magenta = (White - Green/255)/White
// Yellow = (White - Blue/255)/White
// Black = 1 - white 
// if RGB(0,0,0) => CMYK(0,0,0,1)
import java.util.Scanner;
public class ColorConv{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r,g,b ;
		double rs,gs,bs ;
		double c,m,y,k,w;
		System.out.print("Enter color format RGB: ");
		r = sc.nextInt(); g = sc.nextInt(); b = sc.nextInt();
		if( r == 0 && g == 0 && b == 0 ){ c=0 ; m=0 ; y=0 ; k=1 ; } 
		else{
			rs = r/255.0 ; gs = g/255.0 ; bs = b/255.0 ;
			if( rs >= gs && rs >= bs ) w = rs ;
			else if( bs >= gs && bs >= rs ) w = bs ;
			else w = gs ;
			k = 1 - w ;
			c = (w-rs)/w ; m = (w-gs)/w ; y = (w-bs)/w ;
		}
		System.out.print("RGB("+r+", "+g+", "+b+") = CMYK("+c+", "+m+", "+y+", "+k+")");
		sc.close();
	}
}