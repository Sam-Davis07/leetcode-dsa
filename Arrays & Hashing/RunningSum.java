// 1480. Running Sum of 1d Array

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

public class RunningSum {
    public static int[] runningSum(int[] nums) {

        // MY Logic
        // int sum = nums[0];
        // int[] newArr = new int[nums.length];
        // newArr[0] = sum;
        // for(int i = 1 ; i < nums.length; i++){
        // sum += nums[i];
        // newArr[i] = sum;
        // }

        // return newArr;

        // GPT Logic

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };

        int[] result = runningSum(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}