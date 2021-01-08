package com.javacasestudy.selenium;

import java.util.HashMap;
import java.util.Map;

public class HashMapPgrm 
{
  public static void main (String[] args)
  {
	  HashMap<String, Integer> hm = new HashMap<String,Integer>();
	  
	  hm.put("sam",3);
	  hm.put("the", 3);
	  hm.put("fat cat", 7);
	  
	  System.out.println("Size of hashmap is :"+hm.size());
	  
	  System.out.println("HashMap elements are :"+hm);
	  
	  System.out.println("Reterive the value for String fat cat is :"+hm.get("sam"));
	  
	  
	  System.out.println("Is the hashmap contains key 'sam' : "+hm.containsKey("sam"));
	  
	  System.out.println("Is the hashmap conatins value 7 " +hm.containsValue(7));
	  
	  System.out.println("if the hashmapis empty return false :"+hm.isEmpty());
	  
	  System.out.println("From hashmap print only keys" +hm.keySet());
	  
	  System.out.println("Priniting only values from hashmap" +hm.values());
	  
	  System.out.println("Retrieveing all values from hashmap" +hm.entrySet());
	  
	  System.out.println("Replace value for key 'the' :" +hm.replace("the", 3, 6));
	  
	  
	  //Iterate the map using for each loop
	  
	  for (Map.Entry<String, Integer> e :hm.entrySet())
	  {
		  System.out.println("Key:" +e.getKey()+ "  Value :" +e.getValue());
	  }
	  
	   
	  
  }
}
