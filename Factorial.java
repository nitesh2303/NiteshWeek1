/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Factorial.java
 *  Execution:    java -cp bin com.bridgelabz.util.Factorial
 *  
 *  Purpose:Take command line argument to find n! =1 * 2 * ... * n
 *
 *  @author  Nitesh
 *  @version 1.0
 *  @since   6-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
class CalculateFactorial
{
	/*
	*Static method to find factorial
	*/
	public static long factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class Factorial
{
	public static void main(String[] args)
	{
		//create the object of class in which factorial() method present
		CalculateFactorial cf = new CalculateFactorial();
		int num;
		//Take input from command line argument
		num=Integer.parseInt(args[0]);
		System.out.println("Factorial is= "+cf.factorial(num));
	}
}