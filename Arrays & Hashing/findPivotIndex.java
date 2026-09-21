// 724. Find Pivot Index
// Input: nums = [1,7,3,6,5,6]
// Output: 3
// Explanation:
// The pivot index is 3.
// Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
// Right sum = nums[4] + nums[5] = 5 + 6 = 11

// IF LEFTSUM == RIGHTSUM THEREFORE THE PIVOT IS THAT INDEX ONLY;
// IF NO PIVOT RETURN -1;

public class findPivotIndex {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int result = pivotIndex(nums);
        System.out.println("Result: " + result);
    }

    public static int pivotIndex(int[] nums) {

        // GPT Logic (Which is way better than mine) as it is having time complexity
        // O(n)

        int pivot = -1;
        int totalSum = 0;
        int leftSum = 0;

        for (int n : nums) {
            totalSum += n;
        }

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                pivot = i;
                break;
            }

            leftSum += nums[i];
        }

        return pivot;

        // My Logic (Slower) as it is having time complexity O(n^2)

        // int pivot = -1;

        // for (int i = 0; i < nums.length; i++) {
        // int leftSum = 0;
        // int rightSum = 0;

        // for (int j = 0; j < i; j++) {
        // leftSum += nums[j];
        // }

        // for (int k = i + 1; k < nums.length; k++) {
        // rightSum += nums[k];
        // }

        // if (leftSum == rightSum) {
        // pivot = i;
        // break;
        // }

        // }

        // return pivot;

    }

}