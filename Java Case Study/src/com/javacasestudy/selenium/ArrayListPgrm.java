package com.javacasestudy.selenium;

import java.util.ArrayList;

public class ArrayListPgrm 
{
public static void main ( String[] args)
{
	ArrayList<String> al = new ArrayList<String>();
	al.add("sam");
	al.add("the");
	al.add("cat");
	al.add("catching");
	al.add("bad");
	
	System.out.println("Array list elements after adding are as follows:");
	for(String str:al)
	{
		System.out.println(str);
	}
	
	al.add(2, "fat");
	al.add(6,"rat");
	al.add(4,"is");
	
	System.out.println("array list after add operation:");
	
	for (String str:al)
	{
		System.out.println(str);
	}
	
	al.remove("bad");
	System.out.println("Array list after removing one element");
	for(String str:al)
	{
		System.out.println(str);
	}
	
	System.out.println("Size of array List");
	System.out.println(al.size());
	
	System.out.println("Element at Index 5 is:" +al.get(5));
	
	System.out.println("Setting the element at index 5:");
	al.set(5, "catching a bad");
	
	System.out.println("Listing the array list after setting a 5 index element");
	
	for(String str:al)
	{
		System.out.println(str);
	} 
	
	ArrayList<String> a2=new ArrayList<String>();
	
	
	a2.addAll(al);
	a2.remove("the");
	System.out.println(a2);
	System.out.println("ArrayList contains the string 'the' in al: "
            +al.contains("the"));
	
	System.out.println("ArrayList contains the string 'the' in a2: "
            +a2.contains("the"));
	
	System.out.println("Size of Array list a2 is " + a2.size());
			
}
}
