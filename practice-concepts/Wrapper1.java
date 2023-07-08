// Program to demonstrate the concept of Wrapper Class in java
public class Wrapper1{
	public static void main(String[] args){
		Integer a = new Integer(2);
		Integer b = new Integer(2);
		System.out.println(a==b);
		Integer c = Integer.valueOf(3);
		Integer d = Integer.valueOf(3);
		System.out.print(c==d);
	} 
}