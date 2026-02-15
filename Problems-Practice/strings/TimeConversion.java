import java.util.Scanner;

/*
 * Problem: Time Conversion (HackerRank)
 *
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 * Rules:
 * - 12:00:00AM on a 12-hour clock becomes 00:00:00 in 24-hour format.
 * - 12:00:00PM on a 12-hour clock remains 12:00:00 in 24-hour format.
 * - For PM times (except 12 PM), add 12 to the hour.
 * - For AM times (except 12 AM), keep the hour unchanged.
 *
 * Example:
 * Input:  "07:05:45PM"
 * Output: "19:05:45"
 *
 * Approach:
 * - Extract the hour and the AM/PM indicator from the string.
 * - Convert the hour to an integer.
 * - Apply conversion rules based on AM or PM.
 * - Reconstruct the time string without the AM/PM suffix.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */


class Timeconverter{
    public String generate(String s){
        String hour = s.substring(0,2);
        String format = s.substring(8);
        String res = s.substring(2,8);
        int num = Integer.parseInt(hour);
        String h1;

        if(format.equalsIgnoreCase("AM")){
            if(num==12){
                h1 = "00";
            }
            else{
                h1 = String.format("%02d",num);
            }
        }
        else{
            if(num!=12){
                num+=12;
            }
            h1 = String.valueOf(num);
        }

        String ans = h1 + res;
        return ans;
    }
}

public class TimeConversion {
    public static void main(String[] args) {
        Timeconverter time = new Timeconverter();
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(time.generate(s));
    }
}
