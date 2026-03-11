import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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

    @Test
    public void predictPartyVictory() {
        assertEquals("Radiant", sol.predictPartyVictory("RD"));
        assertEquals("Dire", sol.predictPartyVictory("RDD"));
        assertEquals("Dire", sol.predictPartyVictory("DDRRR"));
        assertEquals("Radiant", sol.predictPartyVictory("RDDRR"));
        assertEquals("Dire", sol.predictPartyVictory("RDRDDDRDDRDRDDRRRRRD"));
        assertEquals("Dire", sol.predictPartyVictory("RDDRRDD"));
        assertEquals("Radiant", sol.predictPartyVictory("R"));
        assertEquals("Radiant", sol.predictPartyVictory("RR"));
    }
}
