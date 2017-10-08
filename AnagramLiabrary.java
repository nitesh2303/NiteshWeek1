/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/AnagramLiabrary.java
 *  Execution:    java -cp bin com.bridgelabz.util.AnagramLiabrary
 *  
 *  Purpose: To check strings are anagram or not using liabraries
 *
 *  @author  Nitesh
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Arrays;
import java.util.Scanner;
/**
*	Main Class to perform Anagram
*/
public class AnagramLiabrary
{
  static void isAnagram(String s1, String s2)
	{
		//Using replaceAll() to replace the white space 
		String copyOfs1=s1.replaceAll("\\s","");
		String copyOfs2=s2.replaceAll("\\s","");
		boolean status=true;

		if(copyOfs1.length()!=copyOfs2.length())
		{
			status=false;
		}
		else
		{
			char[] s1Array=copyOfs1.toLowerCase().toCharArray();
			char[] s2Array=copyOfs2.toLowerCase().toCharArray();
			//Sorting the array using Arrays.sort() method
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			//Using Arrays.equals() method to compare the arrays
			status=Arrays.equals(s1Array,s2Array);
		}
		if(status)
		{
			System.out.println(s1+" and "+s2+" are anagrams");
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
	/**
	*	main method to perform string functions
	*/
    public static void main(String[] args)
    {
		/**
		*	scanner class for taking input
		*/  
		System.out.println("Enter first string:");
		Scanner sc = new Scanner(System.in);
		//Take first string
		String str1=sc.nextLine();
		System.out.println("Enter second string:");
		//Take second string
		String str2=sc.nextLine();
		/**
		*	static method call if returns true than anagram else not
		*/
		isAnagram(str1,str2);
    }
}