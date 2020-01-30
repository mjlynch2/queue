import org.junit.Test;

import static org.junit.Assert.*;

public class DoublyLinkedQueueTest {

    @Test
    public void testDoublyLinkedQueue() {
        DoublyLinkedQueue doublyLinkedQueue = new DoublyLinkedQueue();
        doublyLinkedQueue.pushFront("a");
        doublyLinkedQueue.pushFront("b");
        doublyLinkedQueue.pushBack("c");
        doublyLinkedQueue.pushBack("d");
        assertEquals( "b", doublyLinkedQueue.popFront());
        assertEquals( "a", doublyLinkedQueue.popFront());
        assertEquals( "d", doublyLinkedQueue.popBack());
        assertEquals( "c", doublyLinkedQueue.popBack());
        doublyLinkedQueue.pushFront("a");
        doublyLinkedQueue.popFront();
        doublyLinkedQueue.pushBack("a");
        doublyLinkedQueue.popBack();
    }
}