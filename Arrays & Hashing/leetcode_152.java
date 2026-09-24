// 152. Maximum Product Subarray

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

public class leetcode_152 {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int maxPro = nums[0];
        int minPro = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int oldMax = maxPro;
            int oldMin = minPro;
            maxPro = Math.max(nums[i], Math.max(oldMax * nums[i], oldMin * nums[i]));
            minPro = Math.min(nums[i], Math.min(oldMax * nums[i], oldMin * nums[i]));
            currentMax = Math.max(currentMax, Math.max(maxPro, minPro));
        }

        return currentMax;
    }
}
