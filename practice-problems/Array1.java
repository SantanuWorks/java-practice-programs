// Write a program to find average marks obtained by a class of 30 students. 
import java.util.Scanner;
public class Array1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[30];
		int sum = 0 ;
		float avg ;
		System.out.print("Enter marks of 30 students: ");
		for(int i = 0; i < 30; i++){
			marks[i] = sc.nextInt();
		}
		for(int i = 0; i < 30; i++){
			sum += marks[i];
		}
		avg = sum / 30.0f ;
		System.out.print("Average marks: "+avg);
	}
}