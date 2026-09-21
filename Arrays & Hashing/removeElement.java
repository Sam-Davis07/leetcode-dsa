// 27. Remove Element

// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]

public class removeElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        int result = removeElement(nums, val);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}