import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.ListNode;
import com.example.ListSolution;
import com.example.Solution;

public class ListTest {
    Solution sol;
    ListSolution lsol;
    ListNode h, n;

    @Before
    public void setUp() {
        sol = new Solution();
        lsol = new ListSolution();

        n = new ListNode(1, new ListNode(2));
        h = n;
        n = n.next();
        n.setNext(new ListNode(3, new ListNode(4)));
    }

    @Test
    public void ListNodeTest() {

        assertArrayEquals(new int[] { 1, 2, 3, 4 }, h.toArray());

        ListNode a = ListNode.ListNodeFactory(new int[] { 2, 3, 4 });
        assertArrayEquals(n.toArray(), a.toArray());
    }

    @Test
    public void oddEvenList() {
        assertArrayEquals(new int[] { 1, 3, 2, 4 }, lsol.oddEvenList(h).toArray());
        ListNode b = ListNode.ListNodeFactory(new int[] { 1, 2, 3, 4, 5 });
        assertArrayEquals(new int[] { 1, 3, 5, 2, 4 }, lsol.oddEvenList(b).toArray());
        ListNode c = ListNode.ListNodeFactory(new int[] { 2, 1, 3, 5, 6, 4, 7 });
        assertArrayEquals(new int[] { 2, 3, 6, 7, 1, 5, 4 }, lsol.oddEvenList(c).toArray());
        ListNode d = ListNode.ListNodeFactory(new int[] { 1 });
        assertArrayEquals(new int[] { 1 }, lsol.oddEvenList(d).toArray());
        ListNode e = ListNode.ListNodeFactory(new int[] { 1, 2 });
        assertArrayEquals(new int[] { 1, 2 }, lsol.oddEvenList(e).toArray());
    }

}
