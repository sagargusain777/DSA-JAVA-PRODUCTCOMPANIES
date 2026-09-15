
public class Leetcode876 {
    public static void main(String[] args) {

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {

            if (fast.next.next = null) {
                fast = fast.next;
            } else {
                fast = fast.next.next;
            }

            slow = slow.next;
        }

    }
}