import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.example.Solution;

public class SetMapTest {

    private Solution sol;

    @Before
    public void setUp() {
        sol = new Solution();
    }

    @Test
    public void findDifferenceTest() {
        int[] nums11 = new int[] { 1, 2, 3 };
        int[] nums12 = new int[] { 2, 4, 6 };
        assertEquals(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(4, 6)),
                sol.findDifference(nums11, nums12));

        int[] nums21 = new int[] { 1, 2, 3, 3 };
        int[] nums22 = new int[] { 1, 1, 2, 2 };
        assertEquals(Arrays.asList(
                Arrays.asList(3),
                Arrays.asList()),
                sol.findDifference(nums21, nums22));
    }

    @Test
    public void uniqueOccurrencesTest() {
        int[] u1 = new int[] { 1, 2, 2, 1, 1, 3 };
        assertEquals(true, sol.uniqueOccurrences(u1));

        int[] u2 = new int[] { 1, 2 };
        assertEquals(false, sol.uniqueOccurrences(u2));
        int[] u3 = new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        assertEquals(true, sol.uniqueOccurrences(u3));
    }

}
