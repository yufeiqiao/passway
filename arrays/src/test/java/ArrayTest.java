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
    public void reverseVowelsTest() {
        Solution sol = new Solution();
        assertEquals("leotcede", sol.reverseVowels("leetcode"));
        assertEquals("AceCreIm", sol.reverseVowels("IceCreAm"));
        assertEquals("e", sol.reverseVowels("e"));
        assertEquals("ae", sol.reverseVowels("ea"));
        assertEquals("aa", sol.reverseVowels("aa"));
        assertEquals("", sol.reverseVowels(""));
    }
}
