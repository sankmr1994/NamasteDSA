package _05_linked_list;

public class _07_remove_Nth_node_from_end_of_list {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);
        System.out.println(myLinkedList.size);

        int n = 2;

        int index = myLinkedList.size - n;
        MyLinkedList.Node current = myLinkedList.head;
        if (myLinkedList.size == n) {
            myLinkedList.head = myLinkedList.head.next;
        } else {
            for (int i = 1; i <= index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        myLinkedList.printLL();
    }
}
