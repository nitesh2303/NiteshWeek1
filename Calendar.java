/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Calendar.java
 *  Execution:    java -cp bin com.bridgelabz.util.Test
 *  
 *  Purpose:To display Calender to find calendar days.
 *
 *  @author  Nitesh
 *  @version 1.0
 *  @since   6-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
/**
*	Calendar class to displayCalender
*/
public class Calendar {
    
	//Declare variable 
    static int year,month;
	
/**
*	dayofweek method to return day
*	@param month and year
*	@return calDay
*/	
    public static int day(int month,int year)
    {
        int day=1;
        int y0=year-(14-month)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=month+12*((14-month)/12)-2;
        int  calDay=(day+x+31*m0/12)%7;
        return calDay;
    }
/**
*	isLeap method check current year is leap or not
*/
    public static boolean isLeap(int year)
    {
        if((year%4==0)||(year%400==0))
            return true;
        else if(year%100==0)
            return false;
            return false;
    }
/**
*	displayCalender method displayCalender and dates
*	@param month and year
*/
    public static void displayCalender(int month,int year)
    {
        int space=day(month,year);
        String mMonth[]={"","January","February","March","April","May",
            "June","July","August","September","October","November","December"};
        System.out.println(mMonth[month]+" "+year);
        
        int Month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        if(isLeap(year))
            Month[2]=29;
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        int number=1;
        int spaceIn=0;
        for (int i = 0; i < 6; i++) 
		{
            for (int j = 0; j < 7; j++) 
			{
                if(spaceIn<space)
				{
                    System.out.print("     ");
                    spaceIn++;
                }
                else if(number<=Month[month])
                {
                    System.out.print(number);
                number++;
                if(number<11)
                    System.out.print("    ");
                else
                    System.out.print("   ");
                }   
            }
            System.out.println();
        }
    }
}
class Test{
    public static void main(String[] args) 
	{
		Calendar cl = new Calendar();
		int year,month;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year and month");
        year=input.nextInt();
        month=input.nextInt();
        cl.displayCalender(month, year);
            
    }
}
