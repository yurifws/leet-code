package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P242_Valid_Anagram;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P242_Valid_AnagramTest {

    private final P242_Valid_Anagram solution = new P242_Valid_Anagram();

    @Test
    void case1() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));

    }

    @Test
    void case2() {
        assertFalse(solution.isAnagram("rat", "car"));
    }
}
