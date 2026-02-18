import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Migration{
    public int birds(List<Integer> arr){
        int [] freq = new int[6];
        for(int id: arr){
            freq[id]++;
        }

        int maxcount = 0;
        int result = 0;

        for(int i=1 ; i<6 ; i++){
            if(freq[i]>maxcount){
                maxcount = freq[i];
                result = i;
            }
        }
        return result;
    }
}

public class Migratory_Birds {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        Migration mgr = new Migration();
        int n = scn.nextInt();
        for(int i=0 ; i<n ; i++){
            arr.add(scn.nextInt());
        }
        int res = mgr.birds(arr);
        System.out.println(res);
    }
}
