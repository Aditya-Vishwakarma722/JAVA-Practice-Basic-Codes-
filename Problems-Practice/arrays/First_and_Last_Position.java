import java.util.ArrayList;
import java.util.List;

/*
Find the First and Last Position :
Given a list and a target value, find -
First occurrence
Last occurrence

Input:
[10, 20, 30, 20, 40, 20, 50]
target = 20

Output:
First = 1
Last = 5

 */
public class First_and_Last_Position {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(20);
        list.add(50);
        System.out.println(list);
        int find = 20;

        int first = -1;
        int last = -1;
        for(int x : list){
            if(find == x){
                first = list.indexOf(x);
                break;}
        }
        for(int j = list.size()-1;j>=0;j--){
            if(find == list.get(j)){
                last = j;
                break;}
        }

        System.out.println("first occurence : "+first);
        System.out.println("last occurence : "+last);
    }
}
