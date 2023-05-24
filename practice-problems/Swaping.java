// interchange content of two variable C and DATA_CONVERSION
import java.util.Scanner ;
public class Swaping{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int C, D;
		System.out.print("Enter value for C & D: ");
		C = sc.nextInt(); D = sc.nextInt();
		int temp ;
		System.out.println("Before Interchange: C = "+C+", D = "+D);
		temp = C ;
		C = D ;
		D = temp ;
		System.out.print("After Interchange: C = "+C+", D = "+D);
		sc.close();
	}
}