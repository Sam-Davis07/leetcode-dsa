// 128. Longest Consecutive Sequence

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
import java.util.*;

public class Leetcode_128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        // Main part

        int longest = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int count = 1;

                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }

                longest = Math.max(longest,count);
            }
        }

        return longest;

    }
}
