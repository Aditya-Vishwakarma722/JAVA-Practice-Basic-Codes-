import java.util.ArrayList;
import java.util.List;

/*
Student Marks Analyzer :
You are given the marks of N students.

Store them and determine:
- Highest mark
- Lowest mark
- Average mark
- Number of students who scored above the average

Example --

Input:
[78, 65, 91, 43, 82]

Output:
Highest = 91
Lowest = 43
Average = 71.8
Above Average = 3
*/
public class Student_Marks_Analyzer {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(65);
        list.add(91);
        list.add(43);
        list.add(82);
        System.out.println("Elements in the List : "+list+"\n");


        System.out.print("Case 1 : Highest Element -- ");
        int max = list.get(0);
        for(int x : list){
            if(x>max) max = x;
        }
        System.out.println(max);


        System.out.print("Case 2 : Lowest Element -- ");
        int min = list.get(0);
        for(int x : list){
            if(x<min) min = x;
        }
        System.out.println(min);


        System.out.print("Case 3 : Average -- ");
        int total = 0;
        for(int x : list){
            total+=x;
        }
        int size = list.size();
        double avg = (double)total/size;
        System.out.println(avg);


        System.out.print("Case 4 : Above Average -- ");
        int count = 0;
        for(int x : list){
            if(x>=avg) count++;
        }
        System.out.println(count);
    }
}