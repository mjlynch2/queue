public class DoublyLinkedQueue {

    private Node head;
    private Node tail;

    private class Node {
        private String value;
        private Node previous;
        private Node next;
    }

    public DoublyLinkedQueue() {
        head = null;
        tail = null;
    }

    public void pushFront(String s) {
        Node newHead = new Node();
        newHead.value = s;
        if (head == null) {
            tail = newHead;
        } else {
            head.previous = newHead;
        }
        newHead.next = head;
        head = newHead;
    }

    public void pushBack(String s) {
        Node newTail = new Node();
        newTail.value = s;
        if (tail == null) {
            head = newTail;
        } else {
            tail.next = newTail;
        }
        newTail.previous = tail;
        tail = newTail;
    }

    public String popFront() {
        Node nodeToPop = head;
        if (head.next == null) {
            tail = null;
        } else {
            head.next.previous = null;
            head = head.next;
        }
        return nodeToPop.value;
    }

    public String popBack() {
        if (tail == null) { // size 0
            System.out.println("Tail is null");
            return null;
        }
        Node nodeToPop = tail;
        if (head.next == null) { // Size 1
            head = null;
        } else { // Bigger than 1
            tail.previous.next = null;
            tail = tail.previous;
        }
        return nodeToPop.value;
    }

}
