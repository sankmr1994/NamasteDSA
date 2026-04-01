package _05_linked_list;

public class _08_remove_Nth_node_from_end_of_list_approach2 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
//        myLinkedList.addAtTail(2);
//        myLinkedList.addAtTail(3);
//        myLinkedList.addAtTail(4);
//        myLinkedList.addAtTail(5);

        int n = 1;
        MyLinkedList.Node dummy = new MyLinkedList.Node(-1);
        dummy.next = myLinkedList.head;
        MyLinkedList.Node previous = dummy;
        MyLinkedList.Node current = myLinkedList.head;

        for (int index = 1; index <= n - 1; index++) {
            current = current.next;
        }
        System.out.println("Current node : " + current.val);

        while (current.next != null){
            current = current.next;
            previous = previous.next;
        }

        previous.next = previous.next.next;

        myLinkedList.head = dummy.next;
        myLinkedList.printLL();
    }
}
