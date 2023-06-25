// Program to demonstrate various the concept of constructor
public class Constructor5{
	public static void main(String[] args){
		Box b1 = new Box();
		b1.len = 12;
		b1.wid = 11;
		// create a duplicate of b1
		Box b = new Box(b1);
		System.out.print("Length = "+b.len+", Width = "+b.wid);
	}
}
class Box{
	int len, wid;
	Box(){}
	Box(Box b){
		this.len = b.len;
		this.wid = b.wid;
	}
}