package com.bridglabz;

import java.util.Scanner;

public class CheckLeapYearOrNot {
    public void yearChecker(){
        System.out.println("Please enter year to check it is leap year or not :");
        Scanner obj = new Scanner(System.in);
        int year = obj.nextInt();
        if (year < 1582){
            System.out.println("Please enter year above 1582");
        }
        else if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
        {
            System.out.println("Year you entered is a leap year");
        }
        else{
            System.out.println("Year you entered is not a leap year");
        }
    }
}
