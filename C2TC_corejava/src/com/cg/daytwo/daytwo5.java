package com.cg.daytwo;
import java.util.Scanner;
public class daytwo5 {
	public static void main(String[]args) {
		
			int sum = 0;
		    int number = 0;

		    // create an object of Scanner class
		    Scanner sc = new Scanner(System.in);
			   
		    // do...while loop continues 
		    // until entered number is positive
		    do {
		      // add only positive numbers
		      sum += number;
		      System.out.println("Enter a number1");
		      number = sc.nextInt();
		    } while(number >= 0); 
			   
		    System.out.println("Sum = " + sum);
		    sc.close();
		  }
	}

