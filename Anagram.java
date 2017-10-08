/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Anagram.java
 *  Execution:    java -cp bin com.bridgelabz.util.Anagram
 *  
 *  Purpose: To check strings are anagram or not
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
public class Anagram
{
/**
*	Variables Declaration for storing input and to perform operation
*/
    public static char[] name;
    public static char[] dummyname;
    public static String inputName,inputNameFisrt,inputNameSecond;
	public static int count=0;
/**
*	Static Variable is declared to Print message if the name is anagram or not
*/
    public static String ANAGRAM_MESSAGE="The name is anagram";
    public static String NOT_ANAGRAM_MESSAGE="The name is not anagram";
	
/**
*	static method for removeWhiteSpaces
*/

	static String removeSpaces(String str)
    { 
        String removeSpace="";
		for( int i=0;i<str.length();i++)
		{
			if((str.charAt(i)!=' '))
			{
				removeSpace=removeSpace+str.charAt(i);
			}       
		}
		return removeSpace;
	} 
	public static Boolean isAnagram(String name1,String name2 ) 
    {
		//conversion to lowercase
		name1=name1.toLowerCase();
		name2=name2.toLowerCase();
		
		//removeSpace
		name1=removeSpaces(name1);
		name2=removeSpaces(name2);
		
        name=name1.toCharArray();
        dummyname=name2.toCharArray();
		if(name1.length()==name2.length())
		{
		    for(int i=0;i<name.length;i++)
		    {
		        for(int j=0;j<name.length;j++)
		        {
						if(name[i]==dummyname[j])  
						{
							dummyname[j]='$';
							count++;
							break;
						}
		        }
		    }
		    if(count==name.length)
					return true;
		}
		return false;  
    }

/**
*	main method to perform string functions
*/
    public static void main(String[] args) 
	{
/**
*	scanner class for taking input
*/       
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the Name:");
	inputNameFisrt=scanner.nextLine();
	System.out.println("Please enter the Name 2:");
	inputNameSecond=scanner.nextLine();
/**
*	static method call if returns true than anagram else not
*/
	if(isAnagram(inputNameFisrt, inputNameSecond))
		System.out.println(ANAGRAM_MESSAGE);
	else
		System.out.println(NOT_ANAGRAM_MESSAGE);
	}
}
