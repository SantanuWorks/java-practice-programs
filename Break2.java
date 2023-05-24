// program to demonstrate the break statement
public class Break2{
	public static void main(String[] args){
		// break can be used as goto 
		// label
		label1:{
			label2:{
				label3:{
					System.out.println("Before the break in Label 3");
					if(true ) break label3;
					System.out.println("Skipped Label 3 part");
				}
				System.out.println("Before the break in Label 2");
					if(true ) break label2;
					System.out.println("Skipped Label 2 part");
			}
			System.out.println("Before the break in Label 1");
					if(true ) break label1;
					System.out.println("Skipped Label 1 part");
		}
		System.out.print("Finally out the all label blocks");
	}
}