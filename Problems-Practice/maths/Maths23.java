/*
Given an array of integers, calculate the ratios of its elements that are positive, negative and zeros.
Print the decimal value of each fraction on a new line with 6 places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
though answers with absolute error of up to  are acceptable.

Example:
arr[5] = {1,1,0,-1,-1]
postive = 2/5 = 0.400000
negative = 2/5 = 0.400000
zeros = 1/5 = 0.200000

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class result22{
    public static void allRatio(List<Integer>arr) {
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int size = arr.size();


        for (int num : arr) {
            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zeros++;
        }

        System.out.printf("%.6f\n", positive / (double) size);
        System.out.printf("%.6f\n", negative / (double) size);
        System.out.printf("%.6f\n", zeros / (double) size);

    }
}

public class Maths23 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Integer>arr = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            arr.add(scn.nextInt());
        }
        result22.allRatio(arr);

    }
}
