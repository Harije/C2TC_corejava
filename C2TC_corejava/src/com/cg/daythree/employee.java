package com.cg.daythree;

public class employee {
	int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable 
	   
	   
//constructor  
	   employee(int r, String n){  
	   rollno = r;  
	   name = n;  
	   } 
	   
	   
	   
	   //method to display the values  
	   void display ()
	   {System.out.println(rollno+" "+name+" "+college);
	   }  
	} 



//	//Test class to show the values of objects  
//	public class TestStaticVariable1{  
//	 public static void main(String args[]){  
//	 employee s1 = new employee(111,"hariharan");  
//	 employee s2 = new employee(222,"Adhi");  
//	 //we can change the college of all objects by the single line of code  
//	 //Student.college="BBDIT";  
//	 s1.display();  
//	 s2.display();  
//	 }  


