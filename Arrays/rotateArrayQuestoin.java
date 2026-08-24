// 189. Rotate Array

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

public class rotateArrayQuestoin {

    public static void rev(int[] nums, int start, int end) {

        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void rotate(int[] nums, int k) {

        // Reverse Method

        // [1,2,3,4,5,6,7]
        // [7,6,5,4,3,2,1]
        // [5,6,7,1,2,3,4]

        int n = nums.length;
        if (k % n == 0) {
            return;
        }

        k = k % n;

        rev(nums, 0, nums.length - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, nums.length - 1);
    }
}
