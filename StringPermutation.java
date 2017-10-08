/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/StringPermutation.java
 *  Execution:    java -cp bin com.bridgelabz.util.StringPermutation
 *  
 *  Purpose: To find the permutation of given string
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
public class StringPermutation {

/**
*	Variables Declaration for storing input and to perform operation
*/
	public static String inputName;
    public static int count=0;
	/**
     * permutation function
     * @param word string to calculate permutation for
     * @param bigin starting index
     * @param last end index
     */
    public static void permute(String word, int bigin, int last)
    {
        if (bigin== last)
		{
            System.out.println(word);
			count++;
		}
        else
        {
            for (int i = bigin; i <= last; i++)
            {
                word = swap(word,bigin,i);
                permute(word, bigin+1, last);
            }
        }
    }
 
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }	

	/**
	*	main method to perform string functions
	*/
    public static void main(String[] args) {
	/**
	*	scanner class for taking input
	*/   
	System.out.print("Please enter the Name:");
	Scanner sc=new Scanner(System.in);
	inputName=sc.nextLine();
	permute(inputName,0,inputName.length()-1);
	System.out.println("Number of permutation="+count);
	}    
}
