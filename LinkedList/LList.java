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

    // Insertion at Nth index
    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;

        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    // Delete at first in Linked List
    public void deleteFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
        size--;

    }

    // Displaying the Linked List
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }

        System.out.println("END");

    }

}