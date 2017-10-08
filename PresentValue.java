/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PresentValue.java
 *  Execution:    java -cp bin com.bridgelabz.util.PresentValue
 *  
 *  Purpose: To find the amount of money that would have to be invested now, 
			 at the compound interest rate r per period, to obtain a cash flow 
			 of C in T periods
 *
 *  @author  Nitesh
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;
/**
*	Main Class to perform Anagram
*/
public class PresentValue
{
	public static double CalculatePresentValue(double c,double r,double t)
	{
		double presentValue=c/Math.pow((1 + r),t);
		return presentValue;
	}

/**
*	main method to perform string functions
*/
	public static void main(String[] args)
	{
		double c,r,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of c in dollars:");
		c=sc.nextDouble();
		System.out.println("Enter the rate of interest r:");
		r=sc.nextDouble();
		System.out.println("Enter the time period t:");
		t=sc.nextDouble();
	/**
	*	Call the static method
	*/
		System.out.println("Future value is="+CalculatePresentValue(c,r,t));
	}
}
