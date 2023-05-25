// A certain steel is graded according to the following conditions:
// i) Hardness > 50
// ii) Carbon < 0.7
// iii) Tensile strength > 5600 
// grade is given as the following
// 10 -> all three condtion satisfy, 9 -> only i and ii satisfy, 8 -> only ii and iii satisfy
// 7 -> only i and iii satisfy, 6 -> if any one satisfy, 5 -> none satisfy
import java.util.Scanner;
public class SteelGrade{
	public static void main(String[] args){
		int hard, tenil ;
		float carb ;
		boolean c1, c2, c3 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of hardness: ");
		hard = sc.nextInt();
		System.out.print("Enter value of carbon content: ");
		carb = sc.nextFloat();
		System.out.print("Enter value of tensile strength: ");
		tenil = sc.nextInt();
		c1 = hard > 50 ; c2 = carb < 0.7f ; c3 = tenil > 5600 ;
		if( c1 && c2 && c3 ) System.out.print("Grade: 10");
		else if( c1 && c2 ) System.out.print("Grade: 9");
		else if( c2 && c3 ) System.out.print("Grade: 8");
		else if( c1 && c3 ) System.out.print("Grade: 7");
		else if( c1 || c2 || c3 ) System.out.print("Grade: 6");
		else System.out.print("Grade: 5");
	}
}