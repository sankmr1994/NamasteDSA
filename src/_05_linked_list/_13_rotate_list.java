package _05_linked_list;

public class _13_rotate_list {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);

        int k = 5;

        int size = 0;
        MyLinkedList.Node current = myLinkedList.head;
        while (current != null) {
            current = current.next;
            size++;
        }
        k = k % size;

//        if (size == 0 || k == 0) {
//            myLinkedList.printLL();
//            System.exit(0);
//        }

        current = myLinkedList.head;
        for (int index = 1; index <= size - k - 1; index++) {
            current = current.next;
        }
        MyLinkedList.Node head2 = current.next;
        current.next = null;

        current = head2;

        while (current != null && current.next != null){
            current = current.next;
        }

        current.next = myLinkedList.head;
        myLinkedList.head = head2;

        myLinkedList.printLL();


    }


}
