import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNoException;

import org.junit.Test;

import com.example.Solution;

public class PointersTest {
    Solution sol = new Solution();

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

}
