import static org.junit.Assert.assertArrayEquals;
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

    @Test
    public void productExceptSelfTest() {
        Solution sol = new Solution();
        assertArrayEquals(new int[] { 24, 12, 8, 6 }, sol.productExceptSelf(new int[] { 1, 2, 3, 4 }));
        assertArrayEquals(new int[] { 144, 216, 72, 144, 108 }, sol.productExceptSelf(new int[] { 3, 2, 6, 3, 4 }));
        assertArrayEquals(new int[] { 8, 8, 1, 8 }, sol.productExceptSelf(new int[] { 1, 1, 8, 1 }));
        assertArrayEquals(new int[] { 2, 1 }, sol.productExceptSelf(new int[] { 1, 2 }));
    }

    @Test
    public void increasingTripletTest() {
        Solution sol = new Solution();
        assertEquals(true, sol.increasingTriplet(new int[] { 1, 2, 3 }));
        assertEquals(true, sol.increasingTriplet(new int[] { 2, 1, 5, 0, 4, 6 }));
        assertEquals(false, sol.increasingTriplet(new int[] { 5, 4, 3, 1, 0 }));
    }

    @Test
    public void compressTest() {
        Solution sol = new Solution();
        char[] raw = "abcdddefffffffffffffgghhhhijkklllmn".toCharArray();
        String ans = "abcd3ef13g2h4ijk2l3mn";
        int size = sol.compress(raw);
        String res = String.valueOf(raw).substring(0, size);
        assertEquals(ans.length(), size);
        assertEquals(ans, res);
    }
}
