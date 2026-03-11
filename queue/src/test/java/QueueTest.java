import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.Solution;

public class QueueTest {
    Solution sol;

    @Before
    public void setup() {
        sol = new Solution();
    }

    @Test
    public void recentCounterTest() {
        assertArrayEquals(new int[] { 1, 2, 3, 3 }, sol.recentCounter(new int[] { 1, 100, 3001, 3002 }));
    }
}
