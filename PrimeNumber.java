/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrimeNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeNumber
 *  
 *  Purpose:To find prime number, if number is prime than print true else false
 *
 *  @author  Nitesh
 *  @version 1.0
 *  @since   6-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class PrimeNumber{
	/*
	*Static method for checking prime number
	*/
	 public static int isPrime(int i)
	 {
		int flag=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
			
				flag=1;
				break;
			}
		}
		return flag;
	}
	public static void main(String args[])
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check prime number:");
		//Taking input from user
		a=sc.nextInt();
		if(isPrime(a)==1)
		{
			System.out.println("false");
		}
		else
			System.out.println("true");
	}
}