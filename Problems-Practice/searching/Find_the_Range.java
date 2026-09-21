/*
Find the Range :

Given:
[5, 7, 7, 8, 8, 10]
target = 8

return:
[3, 4]

If:
target = 6

return:
[-1, -1]

Restriction: O(log n).
 */
public class Find_the_Range {
    public int[] RangeFind(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = range1(nums, target);
        ans[1] = range2(nums, target);
        return ans;
    }

    public static int range1(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    public static int range2(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Find_the_Range solution = new Find_the_Range();
        int[] arr = {5, 7, 7, 8, 8, 10};

        int[] result1 = solution.RangeFind(arr, 8);
        System.out.println("Target 8 Range: [" + result1[0] + ", " + result1[1] + "]");

        int[] result2 = solution.RangeFind(arr, 6);
        System.out.println("Target 6 Range: [" + result2[0] + ", " + result2[1] + "]");
    }
}
