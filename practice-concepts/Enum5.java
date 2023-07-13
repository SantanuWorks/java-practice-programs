// Program to demonstrate the concept of Enumeration or Java Enum - main() inside an enum
enum Direction{
	NORTH, SOUTH, EAST, WEST;
	// main() can called from command line
	public static void main(String[] args){
		System.out.print("Direction are");
		System.out.print("  " + Direction.NORTH);
		System.out.print(", " + Direction.SOUTH);
		System.out.print(", " + Direction.EAST);
		System.out.print(", " + Direction.WEST);
	}
}