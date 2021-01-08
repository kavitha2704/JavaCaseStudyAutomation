package com.javacasestudy.selenium;

import java.util.HashMap;

public class Countwords 
{
	
	
	    public static void main(String[] args) 
	    {
	        
	        String a = "Betty brought better butter to make better butter bitter";

	        String[] b = a.split(" "); // stored in array and splitted
	        
	        HashMap<String, Integer> hm = new HashMap<String, Integer>();
	        
	        for (int i= 0; i<b.length;i++) 
	        {
	           int count=0;
	           for(int j=0;j<b.length;j++)
	           {
	        	   if(b[i].equals(b[j]))
	        	   {
	        		   count++;
	        	   }
	           }
	           
	           
	           hm.put(b[i], count);
	           
	        }
	        
	        System.out.println(hm);
	    }
	

}
