import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {



    @Test
    public void testQueue() {
        Queue queue = new Queue();
        queue.push("a");
        queue.push("b");
        queue.push("c");
        queue.push("d");
        assertEquals( "a", queue.pop());
        assertEquals( "b", queue.pop());
    }
}