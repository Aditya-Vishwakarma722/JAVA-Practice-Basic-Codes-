/*
Find the Integer Square Root :

Given a non-negative integer n, find:
floor(sqrt(n))

without using:
Math.sqrt()

Examples:
n = 16 → 4
n = 20 → 4
n = 25 → 5
n = 1  → 1
n = 0  → 0
 */

public class Find_Integer_Square_Root {

    public static int IntegerSqrt(int num){
        if(num<2) return num;

        int low = 1;
        int high = num/2;
        int ans = 1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid <= num/mid){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(IntegerSqrt(16));
        System.out.println(IntegerSqrt(20));
        System.out.println(IntegerSqrt(25));
        System.out.println(IntegerSqrt(1));
        System.out.println(IntegerSqrt(0));
    }
}
