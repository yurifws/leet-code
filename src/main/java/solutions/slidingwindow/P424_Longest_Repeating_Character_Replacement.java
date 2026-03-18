package solutions.slidingwindow;

/**
 * #424 - Longest Repeating Character Replacement
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/longest-repeating-character-replacement
 *
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 * Example 2:
 *
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 * There may exists other ways to achieve this answer too.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of only uppercase English letters.
 * 0 <= k <= s.length
 *
 */
public class P424_Longest_Repeating_Character_Replacement {
    public int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        int left = 0;

        int[] count = new int[26];
        int maxCount = 0;
        for (int i = 0; i < chars.length; i++) {
            count[chars[i] - 'A']++;
            maxCount = Math.max(maxCount, count[chars[i] - 'A']);

            if ((i - left + 1) - maxCount > k) {
                count[chars[left] - 'A']--;
                left++;
            }
        }

        return chars.length - left;

    }

    public static void main(String[] args) {
        new P424_Longest_Repeating_Character_Replacement().characterReplacement("ABAB", 2);
    }
}
