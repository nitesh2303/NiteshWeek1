/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Sqrt.java
 *  Execution:    java -cp bin com.bridgelabz.util.Sqrt
 *  
 *  Purpose: To find squareroot
 *
 *  @author  Nitesh
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;

public class Sqrt {
	/*
	*	main function to calculate squareroot
	*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		//intialize epsilon value
        double epsilon=1e-15;
		//get c from user
        System.out.println("Please enter an C:");
        double c=input.nextDouble();
		//assign it to t
        double t=c;
		//calculate average
        t=(c/t+t)/2;
		//take average till condition false
        while(Math.abs(t-c/t)>epsilon*t)
        {
            t=(c/t+t)/2;
        }
        System.out.println("Squareroot of "+c+" is "+t);
    }
    
}