/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SecondLargest.java
 *  Execution:    java -cp bin com.bridgelabz.util.SecondLargest
 *  
 *  Purpose: To find second largest and second smallest
 *
 *  @author  Nitesh
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;

class SecondLargest
{
	/*
	*	To store max , second_max and range n
	*/
	static int max=0,secondMax,n;
	/*
	*	To store min and secondMin
	*/
	static int min=99,secondMin;
	/*
	*	main method to calculate secondlargest and second smallest
	*/
	public static void main(String args[])
	{	
	/*
	*	scanner class to get input 
	*/
		Scanner in=new Scanner(System.in);
		//enter the range
		System.out.println("Enter n:");
		n=in.nextInt();
		// initialize array of size n
		int[] array=new int[n];
		
		System.out.println("Enter numbers:");
		for(int i=0;i<n;i++)
		{		
			//Taking array element form user
			array[i]=in.nextInt();
			//Using math function calculate max and min
			max=Math.max(max,array[i]);
			min=Math.min(min,array[i]);
		}
		
		 //Assigning secondMax as min value
		secondMax=min;
		//Assigning secondMin as max  value
		secondMin=max;
		//find secondMin and secondMax
		for(int j=0;j<n;j++)
		{
			if((secondMax<array[j])&&(array[j]<max))
				secondMax=array[j];
			if((secondMin>array[j])&&(array[j]>min))
				secondMin=array[j];
		}
		
		System.out.println("max="+max);
		System.out.println("secondMax="+secondMax);
		System.out.println("min="+min);
		System.out.println("secondMin="+secondMin);
		
	}
}