package com.iots.test1;

public class Booln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      boolean p=false,q=false;
	        
	      System.out.println("P"+ "\tQ"+ "\tP&Q"+ "\tP|R"+ "\tp^q" +"\t !P" +"\t!Q");
	        
	     
	     
	      p =  true; q = true;
	      System.out.println(p+"\t" +q+"\t" +(p&q)+"\t" +(p|q)+"\t" +(p^q)+"\t" +(!p)+"\t" +(!q)+"\t");
	   
	      p =  true; q = false;
	      System.out.println(p+"\t" +q+"\t" +(p&q)+"\t" +(p|q)+"\t" +(p^q)+"\t" +(!p)+"\t" +(!q)+"\t");
	         
	      p =  false; q = true;
	      System.out.println(p+"\t" +q+"\t" +(p&q)+"\t" +(p|q)+"\t" +(p^q)+"\t" +(!p)+"\t" +(!q)+"\t");
	       
	      p =  false; q = false;
	      System.out.println(p+"\t" +q+"\t" +(p&q)+"\t" +(p|q)+"\t" +(p^q)+"\t" +(!p)+"\t" +(!q)+"\t");
	      
	    
	      
	     }
	}
	
