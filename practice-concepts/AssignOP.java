// Using various operators
// Assignment Operators in Java
public class AssignOP{
	public static void main( String args[] ){
		int a = 20, b = 5 ; // assignment
		System.out.println(a + " += " + b + " = " + (a+=b) ) ;
		System.out.println(a + " -= " + b + " = " + (a-=b) ) ;
		System.out.println(a + " *= " + b + " = " + (a*=b) ) ;
		System.out.println(a + " /= " + b + " = " + (a/=b) ) ;
		System.out.println(a + " %= " + b + " = " + (a%=b) ) ;
		System.out.println(a + " &= " + b + " = " + (a&=b) ) ;
		System.out.println(a + " |= " + b + " = " + (a|=b) ) ;
		System.out.println(a + " ^= " + b + " = " + (a^=b) ) ;
		System.out.println(a + " >>= " + b + " = " + (a>>=b) ) ;
		System.out.println(a + " <<= " + b + " = " + (a<<=b) ) ;
		System.out.println(a + " >>>= " + b + " = " + (a>>>=b) ) ;
		
		System.out.println();
		
		float c = 0.2f, d = 0.5f; // assignment
		System.out.println(c + " += " + d + " = " + (c+=d) ) ;
		System.out.println(a + " -= " + b + " = " + (c-=d) ) ;
		System.out.println(a + " *= " + b + " = " + (c*=d) ) ;
		System.out.println(a + " /= " + b + " = " + (c/=d) ) ;
		System.out.println(a + " %= " + b + " = " + (c%=d) ) ;
		// bitwise operators will not work on floats
		// System.out.println(a + " &= " + b + " = " + (c&=d) ) ;
		// System.out.println(a + " |= " + b + " = " + (c|=d) ) ;
		// System.out.println(a + " ^= " + b + " = " + (c^=d) ) ;
		// System.out.println(a + " >>= " + b + " = " + (c>>=d) ) ;
		// System.out.println(a + " <<= " + b + " = " + (c<<=d) ) ;
		// System.out.println(a + " >>>= " + b + " = " + (c>>>=d) ) ;
		
		System.out.println();
		
		char e = 'A', f = 'B'; // assignment
		System.out.println(e + " += " + f + " = " + (e+=f) ) ;
		System.out.println(e + " -= " + f + " = " + (e-=f) ) ;
		System.out.println(e + " *= " + f + " = " + (e*=f) ) ;
		System.out.println(e + " /= " + f + " = " + (e/=f) ) ;
		System.out.println(e + " %= " + f + " = " + (e%=f) ) ;
		System.out.println(e + " &= " + f + " = " + (e&=f) ) ;
		System.out.println(e + " |= " + f + " = " + (e|=f) ) ;
		System.out.println(e + " ^= " + f + " = " + (e^=f) ) ;
		System.out.println(e + " >>= " + f + " = " + (e>>=f) ) ;
		System.out.println(e + " <<= " + f + " = " + (e<<=f) ) ;
		System.out.println(e + " >>>= " + f + " = " + (e>>>=f) ) ;
		
		System.out.println();
		
		boolean g = true, h = false ; // assignment
		System.out.println(g + " &= " + h + " = " + (g&=h) ) ;
		System.out.println(g + " |= " + h + " = " + (g|=h) ) ;
		System.out.println(g + " ^= " + h + " = " + (g^=h) ) ;
		// following operators will not work on booleans
		// System.out.println(g + " += " + h + " = " + (g+=h) ) ;
		// System.out.println(g + " -= " + h + " = " + (g-=h) ) ;
		// System.out.println(g + " *= " + h + " = " + (g*=h) ) ;
		// System.out.println(g + " /= " + h + " = " + (g/=h) ) ;
		// System.out.println(g + " %= " + h + " = " + (g%=h) ) ; 
		// System.out.println(g + " >>= " + h + " = " + (g>>=h) ) ;
		// System.out.println(g + " <<= " + h + " = " + (g<<=h) ) ;
		// System.out.println(g + " >>>= " + h + " = " + (g>>>=h) ) ;
	}
};