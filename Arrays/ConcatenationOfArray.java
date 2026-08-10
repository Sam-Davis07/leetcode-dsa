public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {

        // My Logic
        // int[] newArr = new int[nums.length * 2];

        // int i;
        // for (i = 0; i < nums.length; i++) {
        // newArr[i] = nums[i];
        // }

        // for (int j = 0; j < nums.length; j++) {
        // int n = i;
        // newArr[n] = nums[j];
        // i++;
        // }

        // return newArr;

        // GPT Logic

        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };

        int[] result = getConcatenation(nums);

        for (int n : result) {
            System.out.print(n + " ");
        }

    }

}
