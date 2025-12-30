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

}