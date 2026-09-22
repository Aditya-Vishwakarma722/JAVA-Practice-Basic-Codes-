/*
Find the First Value Greater Than the Target :

Given:
[10, 20, 30, 40, 50, 60]

For:
target = 35

return:
40

For:
target = 60

there is no greater value:
-1

Now test:
target = 20

Expected:
30
 */

public class Find_First_Value_Greater_Than_Target {
    public static int findFirstGreater(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                result = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println(findFirstGreater(arr, 35));
        System.out.println(findFirstGreater(arr, 60));
        System.out.println(findFirstGreater(arr, 20));
    }
}
