// Paper of size A0 has dimensions 1189mm x 841mm. Each subsequent size A(n)
// is defined as A(n-1) cut in half parallel to its shorter sides. Thus paper
// of size A1 would have dimensions 841mm x 594mm. Write a program to calculate
// and print paper sizes A0, A1, A3, ...A8
public class PaperSize{
	public static void main(String args[]){
		int l = 1189, b = 841 ;
		int temp ;
		System.out.println("A0 -> "+l+" x "+b);
		for( int i = 1 ; i < 9 ; i ++ ){
			temp = l ;
			l = b ;
			b = temp / 2 ;
			System.out.println("A1 -> "+l+" x "+b);
		}
		/* Basic way withour any loop 
		int la0 = 1189, ba0 = 841 ;
		int la1 = ba0, ba1 = la0 / 2 ;
		int la2 = ba1, ba2 = la1 / 2 ;
		int la3 = ba2, ba3 = la2 / 2 ;
		int la4 = ba3, ba4 = la3 / 2 ;
		int la5 = ba4, ba5 = la4 / 2 ;
		int la6 = ba5, ba6 = la5 / 2 ;
		int la7 = ba6, ba7 = la6 / 2 ;
		int la8 = ba7, ba8 = la7 / 2 ;
		System.out.println("A0 -> "+la0+" x "+ba0);
		System.out.println("A1 -> "+la1+" x "+ba1);
		System.out.println("A2 -> "+la2+" x "+ba2);
		System.out.println("A3 -> "+la3+" x "+ba3);
		System.out.println("A4 -> "+la4+" x "+ba4);
		System.out.println("A5 -> "+la5+" x "+ba5);
		System.out.println("A6 -> "+la6+" x "+ba6);
		System.out.println("A7 -> "+la7+" x "+ba7);
		System.out.print("A8 -> "+la8+" x "+ba8);
		*/
	}
}
