package solutions;

import org.junit.jupiter.api.Test;
import solutions.arrays.P0_Default;
import solutions.arrays.P49_Group_Anagrams;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P49_Group_AnagramsTest {

    private final P49_Group_Anagrams solution = new P49_Group_Anagrams();


    /**
     *  *  * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     *      *  *
     *      *  * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    @Test
    void case1() {

        List<List<String>> lists = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertEquals(List.of("eat", "tea", "ate"), lists.get(0));
        assertEquals(List.of("bat"), lists.get(1));
        assertEquals(List.of("tan", "nat"), lists.get(2));
    }

    /**
     *    *  * Input: strs = [""]
     *      *  *
     *      *  * Output: [[""]]
     */
    @Test
    void case2() {
        List<List<String>> lists = solution.groupAnagrams(new String[]{""});
        assertEquals(List.of(""), lists.get(0));
    }

    /**
     *      *  *  * Input: strs = ["a"]
     *      *      *  *
     *      *      *  * Output: [["a"]]
     */
    @Test
    void case3() {
        List<List<String>> lists = solution.groupAnagrams(new String[]{"a"});
        assertEquals(List.of("a"), lists.get(0));
    }
}
