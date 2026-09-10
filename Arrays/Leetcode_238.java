// 238. Product of Array Except Self

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

public class Leetcode_238 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = productExceptSelf(nums);
        for (int i : result)
            System.out.println(i + " ");

    }

    public static int[] productExceptSelf(int[] nums) {
        // int[] result = new int[nums.length];
        // for(int i = 0 ; i < nums.length ; i++){
        // result[i] = 1;
        // }

        // for(int j = 0 ; j < nums.length ; j++){
        // for(int i = 0 ; i < nums.length ; i++){
        // if(i==j){
        // continue;
        // }
        // result[j] *= nums[i];
        // }
        // }
        // return result;

        // Lets go with chatgpt logic..
        // Answer = leftProduct * rightProduct

        int n = nums.length;
        int[] result = new int[n];

        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

}
