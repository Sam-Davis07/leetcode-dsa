// 1389. Create Target Array in the Given Order

// Example 1:

// Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
// Output: [0,4,1,3,2]
// Explanation:
// nums       index     target
// 0            0        [0]
// 1            1        [0,1]
// 2            2        [0,1,2]
// 3            2        [0,1,3,2]
// 4            1        [0,4,1,3,2]

import java.util.ArrayList;

public class targetArrayGivenOrder {

    public static void main(String args[]) {

        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        int[] result = createTargetArray(nums, index);

        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        // My Logic

        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        // list.add(index[i], nums[i]);
        // }

        // int[] arr = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        // arr[i] = list.get(i);
        // }

        // return arr;

        // GPT Logic

        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int ind = index[i];
            for (int j = i; j > ind; j--) {
                target[j] = target[j - 1];

            }

            target[ind] = nums[i];

        }

        return target;

    }
}
