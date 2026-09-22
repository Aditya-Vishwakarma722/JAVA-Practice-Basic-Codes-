/*
Find the Minimum in a Rotated Sorted List :

Given:
[40, 50, 60, 70, 10, 20, 30]

find: 10
without scanning every element.

Try to achieve:
O(log n)
 */

public class Find_Minimum_in_Rotated_Sorted_List {
    public static int findMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {40, 50, 60, 70, 10, 20, 30};
        System.out.println("Minimum element: " + findMin(arr));
    }
}
