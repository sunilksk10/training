package com.iots.test1;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		 {   // Every program must have main()
		    for(int i = 1; i <= 50; i++) {                    // count from 1 to 100
		      if (((i % 3) == 0) && ((i % 5) == 0))            // A multiple of both?
		        System.out.println("fizzbuzz");    
		      else if ((i % 3) == 0) System.out.println("fizz"); // else a multiple of 3?
		      else if ((i % 5) == 0) System.out.println("buzz"); // else a multiple of 5?
		      else System.out.println(i);                        // else just print it
		      //System.out.println(" "); 
		    }
		    System.out.println();
		  }
		}
		/*
		int i;

		for (i = 1; i <= 50; i++) {
			if ((i % 3) == 0) {
				System.out.println("Deepika");
			}
			if ((i % 5) == 0) {
				System.out.println("Padukone");
			}
			if ((i % 3) == 0 && (i % 5) == 0) {
				System.out.println("Deepika Padukone");
			}
		} */
	}

