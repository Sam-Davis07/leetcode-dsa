// 136. Single Number

// Example 1:

// Input: nums = [2,2,1]

// Output: 1

// Example 2:

// Input: nums = [4,1,2,1,2]

// Output: 4

import java.util.Arrays;

public class singleNumber {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        System.out.print(singleNumber123(nums));
    }

    public static int singleNumber123(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
