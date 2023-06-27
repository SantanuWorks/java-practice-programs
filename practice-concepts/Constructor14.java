// Program to demonstrate various the concept of constructor - Class has only three object
public class Constructor14{
	public static void main(String[] args){
		ThreeObjectOnly one = ThreeObjectOnly.createObject();
		ThreeObjectOnly two = ThreeObjectOnly.createObject();
		ThreeObjectOnly three = ThreeObjectOnly.createObject();
		// will be null
		ThreeObjectOnly four = ThreeObjectOnly.createObject();
		ThreeObjectOnly five = ThreeObjectOnly.createObject();
	}
}
// This class only allow three objects
class ThreeObjectOnly{
	private static int count = 1; 
	private ThreeObjectOnly(){
		System.out.println("Object Created");
	}
	public static ThreeObjectOnly createObject(){
		if( count < 4 ){ count ++; return new ThreeObjectOnly(); }
		else{ System.out.println("can't create "); return null; }
	}
}
