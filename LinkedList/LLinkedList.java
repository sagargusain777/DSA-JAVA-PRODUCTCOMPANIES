public class LLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LLinkedList() {
        this.size = 0;
    }

    public class Node {

        private int data;
        private Node next;

        public Node(int value) {
            this.data = value;
        }

        public Node(int value, Node next) {
            this.data = value;
            this.next = next;
        }

    }

}
