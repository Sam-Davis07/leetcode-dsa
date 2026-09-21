// 347. Top K Frequent Elements

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2

// Output: [1,2]
import java.util.*;

class Leetcode_347 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] result = topKFrequent(nums, k);
        for (int i : result)
            System.out.print(i + " ");
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;

    }
}