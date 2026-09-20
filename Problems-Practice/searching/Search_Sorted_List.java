/*
Search a Sorted List :

A list of employee IDs is sorted:
[10, 20, 30, 40, 50, 60, 70, 80]

Find the position of 60.
Your solution should take advantage of the fact that the data is sorted.

Then test:
target = 35

and return:
-1
 */

import java.util.ArrayList;
import java.util.List;

public class Search_Sorted_List {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();

        int target = 60;
        int left = 0;
        int right = list.size()-1;
        int num = -1;

        while(left<=right){
            int mid = left+(right-left/2);
            if(list.get(mid) == target){
                System.out.println("Index : "+mid);
                num = mid;;
                break;
            }
            else if(target < list.get(mid)){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        if(num==-1){
            System.out.println("Not Found!");
        }
    }
}
