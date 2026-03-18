package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.slidingwindow.P424_Longest_Repeating_Character_Replacement;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P424_Longest_Repeating_Character_ReplacementTest {

    private final P424_Longest_Repeating_Character_Replacement solution = new P424_Longest_Repeating_Character_Replacement();

    @Test
    void case1() {
        assertEquals(4, solution.characterReplacement("ABAB", 2));
    }

    @Test
    void case2() {
        assertEquals(4, solution.characterReplacement("AABABBA", 1));
    }

}
