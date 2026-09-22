/*
Search in a Rotated Sorted List

A sorted list has been rotated:
[40, 50, 60, 70, 10, 20, 30]

Find:
target = 20

Output:
5

Then:
target = 55

Output:
-1

 */

public class Search_in_Rotated_Sorted_List {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {40, 50, 60, 70, 10, 20, 30};

        System.out.println(search(arr, 20));
        System.out.println(search(arr, 55));
    }
}