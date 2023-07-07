// Program to practice the concept of interface in java.
// implementing Comparable class - to sort objects 
// Sorting by more than one field
import java.util.*;
public class Interface14{ 
	public static void main(String[] args){
		Student arr[] = new Student[10];
        arr[0] = new Student("Bijay", 393);
        arr[1] = new Student("Debasish", 379);
        arr[2] = new Student("Chandan", 375);
        arr[3] = new Student("Hari", 345);
		arr[4] = new Student("Ajay", 393);
        arr[5] = new Student("Chetan", 354);
        arr[6] = new Student("Suraj", 375);
        arr[7] = new Student("Dinesh", 316);
		arr[8] = new Student("Akash", 383);
        arr[9] = new Student("Ajay", 378);
        
		System.out.println("Sorting by both name and mark");
		System.out.println("Before sorting: ");
        for (int i = 0; i < arr.length; i++)
            arr[i].setter();
		
		System.out.println();
		Arrays.sort(arr,new SortByNameMark());
		
		System.out.println("After sorting: ");
        for (int i = 0; i < arr.length; i++)
            arr[i].setter();
	}
}
class Student{
	int mark;
	String name;
	Student(String name,int mark){
		this.mark = mark;
		this.name = name;
	}
	void setter(){
		System.out.println("Name: "+this.name+" , Marks: "+this.mark);
	}
}
// implement comparator class
class SortByNameMark implements Comparator<Student>{
	public int compare(Student a, Student b){
		// ascending order
		int com = a.name.compareTo(b.name);
		if( com == 0 ) com = (a.mark < b.mark)?1:-1;
		return com;
	}
}