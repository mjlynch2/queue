class Queue {

    private Node head;
    private Node tail;

    private class Node {
        private String value;
        private Node previous;
    }

    public Queue() {
        tail = null;
    }

    private Node getOneBeforeHead() {
        Node curr = tail;
        while(curr.previous.previous != null) {
            curr = curr.previous;
        }
        return curr;
    }

    public String peek() {
        return head.value;
    }

    public void push(String s) {
        Node oldTail = tail;
        tail = new Node();
        tail.value = s;
        if (head == null) {
            head = tail;
        } else {
            tail.previous = oldTail;
        }
        tail.previous = oldTail;
    }

    public String pop() {
        Node newHead = getOneBeforeHead();
        String s = newHead.previous.value;
        newHead.previous = null;
        return s;
    }
}
