package solutions.twopointers;

/**
 * #125 - Valid Palindrome
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-palindrome
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 *
 */
public class P125_ValidPalindrome {
//    public boolean isPalindrome(String s) {
//        s = s.toLowerCase().replaceAll("[^a-z0-9]", "").trim();
//
//        StringBuilder stringBuilder = new StringBuilder(s);
//        String reverseS = stringBuilder.reverse().toString();
//
//        return s.equals(reverseS);
//    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "").trim();

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length/2; i++) {
            if(charArray[i] != charArray[charArray.length - i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new P125_ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama");
    }
}
