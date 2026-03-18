package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.slidingwindow.P3_Longest_Substring_Without_Repeating_Characters;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P3_Longest_Substring_Without_Repeating_CharactersTest {

    private final P3_Longest_Substring_Without_Repeating_Characters solution = new P3_Longest_Substring_Without_Repeating_Characters();

    //Input: s = "abcabcbb"
    @Test
    void case1() {

        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    //Input: s = "bbbbb"
    @Test
    void case2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    //Input: s = "pwwkew"
    @Test
    void case3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
}
