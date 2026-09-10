// 49. Group Anagrams

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Explanation:

// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Leetcode_49 {

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        // Map<String,List<String>> map = new HashMap<>();

        // for(String str: strs){

        // char[] chars = str.toCharArray();
        // Arrays.sort(chars);

        // String key = new String(chars);

        // map.putIfAbsent(key,new ArrayList<>());
        // map.get(key).add(str);
        // }

        // return new ArrayList<>(map.values());

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int n : count) {
                key.append(n).append('#');
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());

            map.get(key.toString()).add(str);

        }

        return new ArrayList<>(map.values());
    }
}