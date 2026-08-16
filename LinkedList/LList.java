class LList {

    private Node head;
    private Node tail;
    private int size;

    public LList() {
        this.size = 0;
    }

    private class Node {

        private int data;
        private Node next;

        private Node(int value) {
            this.data = value;
        }

        private Node(int value, Node next) {
            this.data = value;
            this.next = next;
        }

    }

    // Insertion the element at first place

    public void insertFirst(int value) {

        Node element = new Node(value);

        element.next = head;
        head = element;

        if (tail == null) {
            tail = head;
        }

        // Increasing the size by one
        size++;

    }

    // Insertion at last of the Linked List

    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    // Displaying the Linked List
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }

        System.out.print("END");

    }

}