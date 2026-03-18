package solutions.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/**
 * #3 - Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters
 *
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 *
 */
public class P3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        char[] charArray = s.toCharArray();
        int left = 0;
        int maxLen = 0;

        for (int i = 0; i < charArray.length; i++) {
            if(!window.add(charArray[i])){
                while(charArray[left] != charArray[i]){
                    window.remove(charArray[left]);
                    left++;
                }
                window.remove(charArray[i]);
                left++;
                window.add(charArray[i]);
            }

            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        new P3_Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("abcabcbb");
    }
}
