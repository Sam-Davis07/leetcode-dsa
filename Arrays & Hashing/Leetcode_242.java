// 242. Valid Anagram
// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false
import java.util.*;

class Leetcode_242 {

    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }

    public static boolean isAnagram(String s, String t) {
        // each char count in s == each char count in t;

        // My solution
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char d : t.toCharArray()) {
            map2.put(d, map2.getOrDefault(d, 0) + 1);
        }
        return map.equals(map2);

        // Chatgpt Solution

        // if(s.length() != t.length()){
        //     return false;
        // }

        // int[] count = new int[26];

        // for(int i = 0 ; i < s.length() ; i++){
        //     count[s.charAt(i)- 'a']++;
        //     count[s.charAt(i) - 'a']--;
        // }

        // for(int n: count){
        //     if(n != 0){
        //         return false;
        //     }
        // }

        // return true;


    }
}