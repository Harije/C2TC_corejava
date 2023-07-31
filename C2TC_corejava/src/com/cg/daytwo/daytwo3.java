package com.cg.daytwo;

import java.util.Scanner;

public class daytwo3 {
	public static void main(String[]args)
	   {
	      int year;    // holds a year

	      // Create a Scanner object for keyboard input.
	      Scanner sc = new Scanner(System.in);

	      // Get the year.
	      System.out.print("Enter a year : ");
	      
	      year = sc.nextInt();

	      // Determine whether the year is leap year.
	      if (year % 4 == 0)
	      {
	         if (year % 100 == 0)
	         {
	            if (year % 400 == 0)
	            {
	               System.out.println("A leap year");
	            }
	            else
	            {
	               System.out.println("Not a leap year");
	            }
	         }
	         else
	         {
	            System.out.println("A leap year");
	         }
	      }
	      else
	      {
	         System.out.println("Not a leap year");
	      }
	   }
}
