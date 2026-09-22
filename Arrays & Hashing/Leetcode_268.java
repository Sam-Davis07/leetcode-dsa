public class Leetcode_268 {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);

        // for(int i = 0 ; i < nums.length ; i++){
        // if(nums[i] != i){
        // return i;
        // }
        // }

        // return nums.length;

        // Using XOR
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i;
            result ^= nums[i];
        }

        return result;

    }
}
