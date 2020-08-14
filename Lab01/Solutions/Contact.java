/* 
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
   Lecturers: Dr Tilman Dingler and Dr Thuan Pham
   Semester 2, 2020, Week 2
   Workshop Sample Solution
   © The University of Melbourne 2020

   Write a java program that displays your name, address and 
   telephone number each on a separate line. 
   Jianzhong Qi, 10 February 2016
*/

import java.util.Scanner;

public class Contact {
	public static void main(String[] args) {
		System.out.println("Name: Jianzhong Qi");
		
		System.out.print("Address: Level 8, Room 14, ");
		System.out.println("Doug McDonell Building (Building 168), ");
		System.out.print("University of Melbourne, Parkville, ");
		System.out.println("VIC 3052");		
		
		System.out.println("Telephone: +61 3 83441412");
	}	
}