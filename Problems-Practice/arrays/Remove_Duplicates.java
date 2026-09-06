/*
Remove Duplicates — Basic Version

Given:
[10, 20, 10, 30, 20, 40, 30]
produce:
[10, 20, 30, 40]

 */

import java.util.ArrayList;
import java.util.List;

public class Remove_Duplicates {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>(List.of(10,20,10,30,20,40,30));
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            int num = list.get(i);
            if(!newList.contains(num)){
                newList.add(num);
            }
        }
        System.out.println(newList);
    }
}
