package com.exception;

public class Ex2 {

	public static void main(String[] args) {
       Ex2 k = new Ex2();
       int a = 10;
       try {
    	   System.out.println(a/0);
    	   String arr[]=new String[6];
   	   System.out.println(arr[9]);
    	    
	}catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		
	}
     finally {
    	 a=0;
    	 k=null;
    	 System.out.println("hello");
    	 
     }
}
       
    	  
      }