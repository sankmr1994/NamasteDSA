package _05_linked_list;

public class _03_linked_list_cycle {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(0);
        myLinkedList.addAtTail(-4);
        myLinkedList.printLL();
//        myLinkedList.makeCycle(1);


        MyLinkedList.Node slow = myLinkedList.head;
        MyLinkedList.Node fast = myLinkedList.head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        System.out.println("Is cycle : " + isCycle);
    }
}
