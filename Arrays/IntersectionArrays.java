// 349. Intersection of Two Arrays

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] res = intersection(nums1, nums2);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }

        int[] result = new int[set1.size()];

        int j = 0;

        for (int n : set1) {
            if (set2.contains(n)) {
                result[j] = n;
                j++;
            }
        }

        return Arrays.copyOfRange(result, 0, j);

    }
}
