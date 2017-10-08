/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeek month day year
 *  
 *  Purpose: To find DayOfWeek
 *
 *  @author  Nitesh
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
 
public class DayOfWeek {
	/*
	*	static function to calculate day of week
	*/
	public static void dayOfWeek(int m,int d,int y)
	{
		int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
		//check if d0 falls on 0 than it will print Sunday
		if(d0==0)
			System.out.println(d0+"->Sunday");
		//check if d0 falls on 1 than it will print Monday
		if(d0==1)
			System.out.println(d0+"->Monday");
		//check if d0 falls on 2 than it will print Tuesday
		if(d0==2)
			System.out.println(d0+"->Tuesday");
		//check if d0 falls on 3 than it will print Wednesday
		if(d0==3)
			System.out.println(d0+"Wednesday");
		//check if d0 falls on 4 than it will print Thursday
		if(d0==4)
			System.out.println(d0+"Thursday");
		//check if d0 falls on 5 than it will print Friday
		if(d0==5)
			System.out.println(d0+"Friday");
		//check if d0 falls on 6 than it will print Saturday
		if(d0==6)
			System.out.println(d0+"Saturday");
			
	}
    public static void main(String[] args) { 
		//take input from command line argument
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
		//function call
		dayOfWeek(m,d,y);
    }

}