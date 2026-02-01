/*
Pattern Printing:

Sample Input:
6

Sample Output:
     #
    ##
   ###
  ####
 #####
######
 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] agrs){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=n ; i>0 ; i--){
            for(int j=i-1 ; j>0 ; j--){
                System.out.printf(" ");
            }
            for(int k=0 ; k<=n-i ; k++){
                System.out.printf("#");
            }
            System.out.println();
        }
    }
}
