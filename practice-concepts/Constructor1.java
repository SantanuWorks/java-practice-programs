// Program to demonstrate various the concept of constructor - default constructor
public class Constructor1{
	public static void main(String[] args){
		Box b = new Box();
		System.out.print("Volume is "+b.volume());
	}
}
class Box{
	private int length;
	private int width;
	private int height;
	Box(){
		length = 0;
		width = 0;
		height = 0;
	}
	int volume(){
		return length*width*height;
	}
}