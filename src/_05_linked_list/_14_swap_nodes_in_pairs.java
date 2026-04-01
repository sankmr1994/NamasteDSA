package _05_linked_list;

public class _14_swap_nodes_in_pairs {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);
        myLinkedList.addAtTail(6);
        myLinkedList.addAtTail(7);
        myLinkedList.addAtTail(8);
        myLinkedList.addAtTail(9);

        MyLinkedList.Node head = myLinkedList.head;

        if (head == null || head.next == null) {
            myLinkedList.printLL();
            System.exit(0);
        }

        MyLinkedList.Node newHead = head.next;
        MyLinkedList.Node previous = head;


        MyLinkedList.Node current = head.next.next;
        newHead.next = previous;
        while (current != null && current.next != null) {
            MyLinkedList.Node next = current.next;
            previous.next = next;
            previous = current;
            current = next.next;
            next.next = previous;
        }

        if (current == null) {
            previous.next = null;
        } else {
            previous.next = current;
        }

        myLinkedList.head = newHead;

        myLinkedList.printLL();

    }
}
