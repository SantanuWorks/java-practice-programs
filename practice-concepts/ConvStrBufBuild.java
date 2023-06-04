// Program to demonstrate the conversion between different class objects
public class ConvStrBufBuild{
	public static void main(String[] args){
		String str = "java";
		System.out.println("String object: "+str);
		
		// convert String to StringBuffer
		StringBuffer strb = new StringBuffer(str);
		System.out.println("StringBuffer object: "+strb);
		
		// convert String to StringBuilder
		StringBuilder strbl = new StringBuilder(str);
		System.out.println("StringBuilder object: "+strbl);
		
		// convert StringBuffer to String
		strb = new StringBuffer("java");
		System.out.println("StringBuffer object: "+strb);
		str = strb.toString();
		System.out.println("String object: "+str);
		
		// convert StringBuilder to String
		strbl = new StringBuilder("cpp");
		System.out.println("StringBuilder object: "+strbl);
		str = strbl.toString();
		System.out.println("String object: "+str);
		
		// StringBuffer to StringBuilder
		strb = new StringBuffer("python");
		System.out.println("StringBuffer object: "+strb);
		str = strb.toString();
		strbl = new StringBuilder(str);
		System.out.println("StringBuilder object: "+strbl);
		
		// StringBuilder to StringBuffer
		strbl = new StringBuilder("c#");
		System.out.println("StringBuilder object: "+strbl);
		str = strbl.toString();
		strb = new StringBuffer(str);
		System.out.print("StringBuffer object: "+strb);
	}
}