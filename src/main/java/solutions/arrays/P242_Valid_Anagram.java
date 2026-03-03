package solutions.arrays;

import java.util.*;

/**
 * #242 - ValidAnagram
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-anagram/
 *
 *Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 *
 * Output: false
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 *
 *
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 *
 */
public class P242_Valid_Anagram {

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//        Arrays.sort(sArr);
//        Arrays.sort(tArr);
//        return Arrays.equals(sArr, tArr);
//    }


    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashSetS = getHashSet(s);
        HashMap<Character, Integer> hashSetT = getHashSet(t);

        return hashSetS.equals(hashSetT);
    }
    //TODO charSet.getOrDefault(c, 0) return value default when there is not a key to find a value
    private HashMap<Character, Integer> getHashSet(String s) {
        HashMap<Character, Integer> charSet = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()){
//            if(Objects.isNull(charSet.get(c))){
//                charSet.put(c, 1);
//            } else {
//                charSet.put(c, charSet.get(c)+1);
//            }
            charSet.put(c, charSet.getOrDefault(c, 0) + 1);
        }
        return charSet;
    }

    public static void main(String[] args) {
        new P242_Valid_Anagram().isAnagram("anagram", "nagaram");
    }


}
