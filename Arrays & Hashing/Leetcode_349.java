// 349. Intersection of Two Arrays

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
import java.util.*;

public class Leetcode_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            set2.add(n);
        }

        int[] result = new int[set1.size()];
        int j = 0;
        for (int n : nums1) {
            if (set2.contains(n)) {
                result[j] = n;
                j++;
            }
        }

        return Arrays.copyOfRange(result, 0, j);

    }
}
