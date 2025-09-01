/*
 * 
 */

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import com.example.Dividor;

public class DividorTest {

    @Test
    public void run() {
        assertArrayEquals(new int[] { 2, 3 }, Dividor.getDividors(5));
    }
}
