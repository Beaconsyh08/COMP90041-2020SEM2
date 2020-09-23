///*
//   The University of Melbourne
//   School of Computing and Information Systems
//   COMP90041 Programming and Software Development
//   Lecturer: Dr Tilman Dingler, Dr Thuan Pham
//   Semester 2, 2020, Week 6
//   Workshop Sample Solution
//   Copyright The University of Melbourne 2020
//*/
//
///* Skeleton code for operations on an array
//	Jianzhong Qi, 10 February, 2016
//*/
//
//import java.util.Scanner;
//
//public class ArrayOperatorSkeleton {
//	private static int ARRAY_LENGTH = 10;
//
//	public static void main(String[] args){
//		int [] numbers = new int [ARRAY_LENGTH];
//
//		// Read in the array from keyboard
//		readArray(numbers);
//
//		// Display an array
//		display(numbers);
//
//		// Get maximum value of an array
//		int max = getMax(numbers);
//		System.out.println("Max value is: " + max);
//
//
//		// Get the sum of all elements in an array
//		int sum = getSum(numbers);
//		System.out.println("Sum is: " + sum);
//
//		// Sort array elements in descending order
//		sortArrayDescendingly(numbers);
//
//		// Display an array
//		display(numbers);
//
//		// Find the element with the largest number of appearances
//		// If there is a tie then return the smaller element
//		int mostFrequent = getMostFrequent(numbers);
//		System.out.println("Most frequent value is: " + mostFrequent);
//	}
//
//
//}