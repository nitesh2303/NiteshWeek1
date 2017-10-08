/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Palindrome.java
 *  Execution:    java -cp bin com.bridgelabz.util.Palindrome
 *  
 *  Purpose: To check the given string is pallindrome or not
 *
 *  @author  Nitesh
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;

/**
*	Main Class to perform string functions
*/

public class Palindrome
{
	/**
	*	Variables Declaration for storing input and to perform operation
	*/
		public static char[] name;
		public static String inputName;
		public static int count=0;
	
	/**
	*	Static Variable is declared to Print message if the name is pallindrome or not
	*/
		public static String PALLINDROME_MESSAGE=" is Pallindrome";
		public static String NOT_PALLINDROME_MESSAGE=" is not Pallindrome";
    
	/**
	*	static method to check string is pallindrome or not
	*/
    public static Boolean isPallindrome(String inputname)
	{
		inputname=inputname.toLowerCase();
		name=inputname.toCharArray();
		for(int i=0;i<name.length/2;i++)
		{
			//if first and last is equal increment count than second first and so on
			if(name[i]==name[name.length-i-1])
			{
				count++;
			}
		}
		if(count==name.length/2)
			return true;
		return false;
	}
	
	/**
	*	main method to perform string functions
	*/
    public static void main(String[] args) {
	/**
	*	scanner class for taking input
	*/       
		System.out.println("Please enter the Name:");
		Scanner sc=new Scanner(System.in);
		inputName=sc.nextLine();
	/*
	*	static method call if returns true than Pallindrome else not
	*/
		if(isPallindrome(inputName))
			System.out.println("The "+inputName+PALLINDROME_MESSAGE);
		else
			System.out.println("The "+inputName+NOT_PALLINDROME_MESSAGE);
	}
}
