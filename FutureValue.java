/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/FutureValue.java
 *  Execution:    java -cp bin com.bridgelabz.util.FutureValue
 *  
 *  Purpose: To find the future value of investing money in dollars
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
public class FutureValue
{
	public static double CalculateFutureValue(double c,double r,double t)
	{
		double futureValue=c*Math.pow((1 + r),t);
		return futureValue;
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
		System.out.println("Future value is="+CalculateFutureValue(c,r,t));
	}
}