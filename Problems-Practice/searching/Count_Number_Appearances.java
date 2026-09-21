/*
Count How Many Times a Number Appears :

Given a sorted list:
[1, 2, 2, 2, 2, 3, 4, 5]
target = 2

return:
4

Your solution should be:
O(log n) not O(n).
 */

public class Count_Number_Appearances {
    public static int countOccurrences(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1, last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) first = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (first == -1) return 0;

        left = first;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                if (nums[mid] == target) last = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last - first + 1;
    }

    public static void main(String [] args){
        int [] arr = {1,2,2,2,2,3,4,5};
        for(int num : arr){
            System.out.print(num+"  ");
        }
        int val = 2;
        System.out.println("Output: " + countOccurrences(arr, 2));
    }
}
