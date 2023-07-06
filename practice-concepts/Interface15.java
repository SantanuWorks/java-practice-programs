// Program to practice the concept of interface in java.
// implementing Comparable class - to sort objects 
// Sorting by more than one field
import java.util.*;
public class Interface15{
	public static void main(String[] args){
		Product arr[] = new Product[22];
        arr[0] = new Product("Water Bottle", 100, 4);
		arr[1] = new Product("Water Bottle", 105, 5);
		arr[2] = new Product("Water Bottle", 95, 3);
        arr[3] = new Product("Pen Stand", 65, 3);
		arr[4] = new Product("Pen Stand", 50, 3);
		arr[5] = new Product("Pen Stand", 80, 5);
		arr[6] = new Product("Pen Stand", 70, 4);
        arr[7] = new Product("Paper Clip", 12, 4);
        arr[8] = new Product("Paper Clip", 14, 4);
        arr[9] = new Product("Compass Box", 180, 5);
        arr[10] = new Product("Compass Box", 210, 4);
		arr[11] = new Product("Smartphone Cover", 150, 5);
		arr[12] = new Product("Smartphone Cover", 100, 4);
		arr[13] = new Product("Smartphone Cover", 80, 3);
        arr[14] = new Product("Toolkit Box", 599, 4);
        arr[15] = new Product("Toolkit Box", 602, 4);
        arr[16] = new Product("Sharp Knife", 120, 4);
        arr[17] = new Product("Sharp Knife", 100, 2);
        arr[18] = new Product("Dish Washer", 59, 4);
		arr[19] = new Product("Cloth Cleaner", 72, 3);
        arr[20] = new Product("Ponds Beauty Powder", 120, 5);
        arr[21] = new Product("Ponds Beauty Powder", 80, 4);
        
		System.out.println("Before sorting: ");
        for (int i = 0; i < arr.length; i++)
            arr[i].setter();
		
		System.out.println();
		Arrays.sort(arr,new SortByNamePriceRating());
		
		System.out.println("After sorting: ");
        for (int i = 0; i < arr.length; i++)
            arr[i].setter();
	}
}
class Product{
	String name;
	int price;
	int rating;
	Product(String name,int price, int rating){
		this.price = price;
		this.name = name;
		this.rating = rating;
	}
	void setter(){
		System.out.println("Name: "+this.name+" , Price: "+this.price+" , Rating: "+this.rating);
	}
}
// implement comparator class
class SortByNamePriceRating implements Comparator<Product>{
	public int compare(Product a, Product b){
		// ascending order
		int com = a.name.compareTo(b.name);
		if( com == 0 ){
			com = (a.price < b.price)?1:-1;
			if( com == 0 ) com = (a.rating < b.rating)?1:-1;
		}
		return com;
	}
}