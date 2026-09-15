public class LinkedListExample {

    public static void main(String[] args) {
        LList myList = new LList();

        myList.insertFirst(15);
        myList.insertFirst(25);
        myList.insertFirst(35);
        myList.insertLast(75);
        myList.display();
        myList.insert(200, 3);
        myList.display();
        myList.deleteFirst();
        myList.display();

    }
}
