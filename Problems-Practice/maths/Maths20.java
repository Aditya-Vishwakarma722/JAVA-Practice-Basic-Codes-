/*
Puppy and Sum:
Read problems statements in Mandarin Chinese, Russian and Vietnamese as well.
Yesterday, puppy Tuzik learned a magically efficient method to find the sum of the integers from 1 to N.
He denotes it as sum(N). But today, as a true explorer,
he defined his own new function: sum(D, N),which means the operation sum applied D times: the first time to N,
and each subsequent time to the result of the previous operation.

For example, if D = 2 and N = 3, then sum(2, 3) equals to sum(sum(3)) = sum(1 + 2 + 3) = sum(6) = 21.

Tuzik wants to calculate some values of the sum(D, N) function. Will you help him with that?

Input:
The first line contains a single integer T, the number of test cases. Each test case is described by a single
line containing two integers D and N.

Output:
For each testcase, output one integer on a separate line.

Knowledge:
if sum(3,3) then sum(sum(sum(3))) meaning that sum(3) = 1+2+3 = 6, now, sum(sum(6)) meaning sum(6) = 1+2+3+4+5+6 = 21, now, sum(21) = 205
More easy to understand, the logic of n(n-1)/2 refers to the number of times, like, if n = 7 then 7*6/2 = 28, in different perspective n=7
So, 1+2+3+4+5+6+7=28. THEREFORE, INSIDE IS THIS N(N-1)/2 BUT OUTSIDE, IT WILL RUN D TIMES, SO USE A FOR LOOP THAT WILL RUN D TIMES.
 */

import java.util.Scanner;

public class Maths20 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int d = scn.nextInt();
            int n = scn.nextInt();
            //Ex. - sum(3,4) = sum(sum(sum(4)))
            int sum = n;
            for(int i=0 ; i<d ; i++){
                sum = sum*(sum+1)/2;
            }
            System.out.println(sum);
        }
    }
}
