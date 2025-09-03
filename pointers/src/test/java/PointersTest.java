import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

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

}
