import java.util.ArrayList;
import java.util.Scanner;

class MiniMaxSum{
    public void soultion(ArrayList<Long> arr){
        long total = 0;
        long min = arr.get(0);
        long max = arr.get(0);

        for(long num : arr){
            total += num;
            if(num<min)min = num;
            if(num>max)max = num;
        }

        long num1 = total-min;
        long num2 = total-max;
        System.out.println(num1+" "+num2);
    }
}

public class MinMaxSum {
    public static void main(String[] args){
        MiniMaxSum mx = new MiniMaxSum();
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        ArrayList<Long> arr = new ArrayList<>();
        for(int i=0 ; i<size ; i++){
            arr.add(scn.nextLong());
        }
        mx.soultion(arr);
    }
}
