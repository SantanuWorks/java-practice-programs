// Program to practice the concept of interface in java.
// implementing Comparable class - to sort objects 
// sorting by one field
import java.util.*;
import java.io.*;
import java.lang.*;
public class Interface13{
	public static void main(String[] args){
		
		Student arr[] = new Student[4];
        arr[0] = new Student("Moni", 393);
        arr[1] = new Student("Ruby", 379);
        arr[2] = new Student("Ramm", 375);
        arr[3] = new Student("Hari", 364);
		
		System.out.println("Sorting by marks");
		System.out.println("Before sorting: ");
        for (int i = 0; i < arr.length; i++)
            arr[i].setter();
		
		System.out.println();
		Arrays.sort(arr,new SortByMark());
		
		System.out.println("After sorting: ");
        for (int i = 0; i < arr.length; i++)
            arr[i].setter();
		
		System.out.println("\nSorting by names");
		System.out.println("Before sorting: ");
        for (int i = 0; i < arr.length; i++)
            arr[i].setter();
		
		System.out.println();
		Arrays.sort(arr,new SortByName());
		
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
class SortByMark implements Comparator<Student>{
	public int compare(Student a, Student b){
		// ascending order
		if( a.mark > b.mark ) return 1;
		else if( a.mark < b.mark ) return -1;
		else return 0;
	}
}
class SortByName implements Comparator<Student>{
	public int compare(Student a, Student b){
		// ascending order
		return a.name.compareTo(b.name);
	}
}