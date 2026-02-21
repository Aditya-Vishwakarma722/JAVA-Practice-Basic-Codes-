/*
 * Day of the Programmer - HackerRank
 *
 * The Day of the Programmer is the 256th day of the year (because 256 = 2^8).
 *
 * Given a year, determine the exact date of the 256th day in that year
 * according to the Russian calendar.
 *
 * Important Historical Detail:
 * - Russia used the Julian calendar before 1918.
 * - In 1918, Russia transitioned to the Gregorian calendar.
 * - During the transition, 13 days were skipped:
 *   January 31, 1918 was followed by February 14, 1918.
 *
 * Calendar Rules:
 *
 * 1) Julian Calendar (year < 1918):
 *    - Leap year if year % 4 == 0
 *
 * 2) Gregorian Calendar (year > 1918):
 *    - Leap year if:
 *        (year % 400 == 0)
 *        OR
 *        (year % 4 == 0 AND year % 100 != 0)
 *
 * 3) Special Case (year == 1918):
 *    - Due to the 13 skipped days, the calculation must be adjusted.
 *
 * Task:
 * - Determine whether the given year is a leap year based on the correct rule.
 * - Account for the special case of 1918.
 * - Compute the date of the 256th day.
 * - Return the date in the format: dd.mm.yyyy
 *
 * Example:
 * Input: 2017
 * Output: 13.09.2017
 *
 * Input: 2016 (leap year)
 * Output: 12.09.2016
 */

import java.util.Scanner;

class DayCalculate{
    String Solver(int year){
        String years = String.valueOf(year);
        String months = ".09.";
        int LeapMonths = 244;
        int NonLeapMonths = 243;
        int date;

        if(year<1918){
            if(year%4 == 0){
                date = 256-LeapMonths;
            }
            else{
                date = 256-NonLeapMonths;
            }
        }
        else if(year>1918){
            if(year%400 == 0 || (year%4==0 && year%100!=0)){
                date = 256-LeapMonths;
            }
            else{
                date = 256-NonLeapMonths;
            }
        }
        else{
            date = 256-230;
        }
        String day = String.valueOf(date);
        String res = day.concat(months).concat(years);
        return res;
    }
}

public class Day_of_the_Programmer {
    static void main(String [] args){
        DayCalculate dlc = new DayCalculate();
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        System.out.println(dlc.Solver(year));
        scn.close();
    }
}
