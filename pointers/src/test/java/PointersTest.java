import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.example.Solution;

public class PointersTest {
    Solution sol;

    @Before
    public void setup() {
        sol = new Solution();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void moveZeroesTest() {
        int[] nums = new int[] { 0, 1, 3, 0, 21, 0, 0, 0, 4, 5, 0, 0 };

        sol.moveZeroes(nums);
        assertArrayEquals(new int[] { 1, 3, 21, 4, 5, 0, 0, 0, 0, 0, 0, 0 }, nums);
    }

    @Test
    public void isSubsequenceTest() {
        assertEquals(true, sol.isSubsequence("abc", "ahbgdc"));
        assertEquals(false, sol.isSubsequence("axc", "ahbgdc"));
        assertEquals(true, sol.isSubsequence("a", "ahbgdc"));
        assertEquals(false, sol.isSubsequence("axc", "a"));
        assertEquals(true, sol.isSubsequence("", "ahbgdc"));
        assertEquals(false, sol.isSubsequence("axc", ""));

    }

    @Test
    public void maxAreaTest() {
        int[] t1 = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        assertEquals(49, sol.maxArea(t1));
        int[] t2 = new int[] { 11, 8, 6, 22, 5, 4, 0, 12, 3, 3, 8, 3, 7 };
        assertEquals(84, sol.maxArea(t2));
        int[] t3 = new int[] { 1, 1 };
        assertEquals(1, sol.maxArea(t3));
        int[] t4 = new int[] { 1, 2 };
        assertEquals(1, sol.maxArea(t4));
    }

    @Test
    public void maxOperationsTest() {
        int[] m1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        assertEquals(4, sol.maxOperations(m1, 10));
        assertEquals(4, sol.maxOperations(m1, 19));
        assertEquals(0, sol.maxOperations(m1, 26));
        assertEquals(1, sol.maxOperations(m1, 3));
        assertEquals(0, sol.maxOperations(m1, 1));
        int[] m2 = new int[] { 3, 1, 3, 4, 3 };
        assertEquals(1, sol.maxOperations(m2, 6));
    }

    @Test
    public void findMaxAverageTest() {
        int[] f1 = new int[] { 1, 12, -5, -6, 50, 3 };

        assertEquals(12.75, sol.findMaxAverage(f1, 4), 0.0001);
        assertEquals(15.66667, sol.findMaxAverage(f1, 3), 0.0001);
        assertEquals(26.5, sol.findMaxAverage(f1, 2), 0.0001);
        assertEquals(50.000, sol.findMaxAverage(f1, 1), 0.0001);
    }

    @Test
    public void maxVowelsTest() {
        assertEquals(3, sol.maxVowels("abciiidef", 3));
        assertEquals(3, sol.maxVowels("abciiidef", 4));
        assertEquals(4, sol.maxVowels("abciiidef", 5));
        assertEquals(2, sol.maxVowels("aeiou", 2));
        assertEquals(0, sol.maxVowels("b", 1));
    }

    @Test
    public void longestOnesTest() {
        int[] t1 = new int[] { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        assertEquals(10, sol.longestOnes(t1, 3));
        // assertEquals(7, sol.longestOnes(t1, 2));
        // assertEquals(6, sol.longestOnes(t1, 1));
        assertEquals(4, sol.longestOnes(t1, 0));
    }

}
