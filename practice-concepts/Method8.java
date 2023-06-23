// Program to demonstrate the Methods in java - method overloading
public class Method6{
	// we can overload main() - but compiler only picks the default once
	public static void main(String[] args){
		System.out.println("real main()");  
		// we can explicitly call main()
		main(2); main("main()", "fake"); main("main()"); 
	}
	public static void main(String arg){
		System.out.println("fake one string main()");  
	}
	public static void main(String arg1, String arg2){
		System.out.println("fake two string main()");  
	}
	public static void main(int a){
		System.out.println("fake one int main()");  
	}
}