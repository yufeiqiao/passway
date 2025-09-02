import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.Solution;

/**
 * Skeleton testing area
 */
public class ArrayTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void basicReverseVowelsTest() {
        Solution sol = new Solution();
        assertEquals("leotcede", sol.basicReverseVowels("leetcode"));
        assertEquals("AceCreIm", sol.basicReverseVowels("IceCreAm"));
        assertEquals("e", sol.basicReverseVowels("e"));
        assertEquals("ae", sol.basicReverseVowels("ea"));
        assertEquals("aa", sol.basicReverseVowels("aa"));
        assertEquals("", sol.basicReverseVowels(""));
    }

    @Test
    public void reverseVowelsTest() {
        Solution sol = new Solution();
        assertEquals("leotcede", sol.reverseVowels("leetcode"));
        assertEquals("AceCreIm", sol.reverseVowels("IceCreAm"));
        assertEquals("eee", sol.reverseVowels("eee"));
        assertEquals("ae", sol.reverseVowels("ea"));
        assertEquals("a", sol.reverseVowels("a"));
        assertEquals("e", sol.reverseVowels("e"));
        assertEquals("", sol.reverseVowels(""));
    }

    @Test
    public void reverseWordsTest() {
        Solution sol = new Solution();
        assertEquals("blue is sky the", sol.reverseWords("the sky is blue"));
        assertEquals("blue is sky the", sol.reverseWords("the sky is    blue"));
        assertEquals("blue is sky the", sol.reverseWords("   the sky  is       blue"));
    }
}
