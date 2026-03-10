import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.Solution;

public class StackTest {
    Solution sol;

    @Before
    public void setup() {
        sol = new Solution();
    }

    @Test
    public void removeStarsTest() {
        assertEquals("lecoe", sol.removeStars("leet**cod*e"));
        assertEquals("", sol.removeStars("erase*****"));
        assertEquals("lecoe", sol.removeStars("leet**cod*e"));
        assertEquals("lecoe", sol.removeStars("leet**cod*e"));
    }

    @Test
    public void asteroidCollisionTest() {
        int[] a = new int[] { 5, 10, -5 };
        assertArrayEquals(new int[] { 5, 10 }, sol.asteroidCollision(a));
        int[] b = new int[] { 5, -5 };
        assertArrayEquals(new int[] {}, sol.asteroidCollision(b));
        int[] c = new int[] { 3, 5, -6, 2, -1, 4 };
        assertArrayEquals(new int[] { -6, 2, 4 }, sol.asteroidCollision(c));
        int[] d = new int[] { 10, 2, -5 };
        assertArrayEquals(new int[] { 10 }, sol.asteroidCollision(d));
    }
}